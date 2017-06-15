package io.github.jffm.springboot.ext.hbase.model.repository;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.jffm.springboot.ext.hbase.model.serializer.ISerializer;
import io.github.jffm.springboot.ext.hbase.model.serializer.SerializationException;
import io.github.jffm.springboot.ext.hbase.model.serializer.SerializationFacory;

public class AbstractHBaseRepository<D> implements IHBaseRepository<D> {

	private static Logger Logger = LoggerFactory.getLogger(AbstractHBaseRepository.class);
	
	public static byte[] CF_INFO = Bytes.toBytes("cfInfo");
	public static byte[] C_INFO_VALUE = Bytes.toBytes("value");
	public static byte[] C_INFO_FORMAT = Bytes.toBytes("format");
	public static byte[] C_INFO_VERSION = Bytes.toBytes("version");

	@Autowired
	private Configuration configuration;
	
	@Autowired
	private SerializationFacory factory;
	
	
	private TableName tableName;
	
	private Class<D> typeParameterClass;

	private Connection connection;	
	
	private String format = "AVRO";
	
	private Object argument;
	
	private long version = 0l;
	
	
	public AbstractHBaseRepository(String tableName, Class<D> typeParameterClass) {
		this.tableName = TableName.valueOf(tableName);
		this.typeParameterClass = typeParameterClass;
	}
	
	@PostConstruct
	public void init() throws IOException {
		//StringWriter stringWriter = new StringWriter();
		//configuration.dumpConfiguration(configuration, stringWriter);
		//System.err.println(stringWriter.toString());
		connection = ConnectionFactory.createConnection(configuration);
		Admin admin = connection.getAdmin();
		if (!admin.tableExists(tableName)) {
			HTableDescriptor tableDescriptor = new HTableDescriptor(tableName);
			HColumnDescriptor columnDescriptor = new HColumnDescriptor(CF_INFO);
			columnDescriptor.setTimeToLive(432000); // five days
			tableDescriptor.addFamily(columnDescriptor);
			admin.createTable(tableDescriptor);
			Logger.info("Table created");
		} else {
			Logger.info("Table already exists");
		}
	}

	public void drop() throws IOException {
		Admin admin = connection.getAdmin();
		if (admin.isTableEnabled(tableName)) {
			admin.disableTable(tableName);
		}
		admin.deleteTable(tableName);
		Logger.info("Table deleted");
	}

	@Override
	public List<D> query() throws IOException, SerializationException {
		Table table = connection.getTable(tableName);
		Scan scan = new Scan();

		// Scanning the required columns
		scan.addColumn(CF_INFO, C_INFO_VALUE);
		scan.addColumn(CF_INFO, C_INFO_FORMAT);
		scan.addColumn(CF_INFO, C_INFO_VERSION);

		// Getting the scan result
		ResultScanner scanner = table.getScanner(scan);
		List<D> results = new ArrayList<>();
		// Reading values from scan result
		for (Result result = scanner.next(); result != null; result = scanner.next()) {
			results.add(deserialize(result));
		}
		// closing the scanner
		scanner.close();

		return results;
	}

	protected D deserialize(Result value) throws SerializationException {
		Cell cellFormat = value.getColumnLatestCell(CF_INFO, C_INFO_FORMAT);
		Cell cellVersion = value.getColumnLatestCell(CF_INFO, C_INFO_VERSION);
		Cell cellValue = value.getColumnLatestCell(CF_INFO, C_INFO_VALUE);
		
		ISerializer serializer = factory.getSerializer(this.typeParameterClass,
				Bytes.toString(CellUtil.cloneValue(cellFormat)),
				Bytes.toLong(CellUtil.cloneValue(cellVersion)), this.argument);
		
		return (D) serializer.deserialize(CellUtil.cloneValue(cellValue));
	}

	@Override
	public D get(byte[] key) throws IOException {
		Get get = new Get(key);
		Table table = connection.getTable(tableName);

		get.addColumn(CF_INFO, C_INFO_VALUE);
		get.addColumn(CF_INFO, C_INFO_FORMAT);
		get.addColumn(CF_INFO, C_INFO_VERSION);

		try {
			get.setMaxVersions(1);
			get.setTimeRange(0, Long.MAX_VALUE);
			Result result = table.get(get);
			return (D) deserialize(result);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public D getVersion(byte[] key, long version) throws IOException {
		Get get = new Get(key);
		Table table = connection.getTable(tableName);

		get.addColumn(CF_INFO, C_INFO_VALUE);
		get.addColumn(CF_INFO, C_INFO_FORMAT);
		get.addColumn(CF_INFO, C_INFO_VERSION);

		try {
			get.setMaxVersions(1);
			get.setTimeRange(0, version);
			Result result = table.get(get);
			return (D) deserialize(result);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public long save(byte key[], D object) throws IOException, SerializationException {
		long version = Long.MAX_VALUE - System.currentTimeMillis();
		Put put = new Put(key, version);

		ISerializer serializer = factory.getSerializer(this.typeParameterClass,format, version, this.argument);
		
		put.addColumn(CF_INFO, C_INFO_FORMAT, Bytes.toBytes(serializer.getFormat()));
		put.addColumn(CF_INFO, C_INFO_VERSION, Bytes.toBytes(serializer.getVersion()));
		put.addColumn(CF_INFO, C_INFO_VALUE, serializer.serialize(object));

		Table table = connection.getTable(tableName);

		table.put(put);

		return version;
	}

	@Override
	public void delete(byte[] key) throws IOException {
		Delete delete = new Delete(key);
		Table table = connection.getTable(tableName);
		table.delete(delete);
	}
	
	public Object getArgument() {
		return argument;
	}
	
	public void setArgument(Object argument) {
		this.argument = argument;
	}
	
	public void setFormat(String format) {
		this.format = format;
	}
	
	public void setVersion(long version) {
		this.version = version;
	}

}