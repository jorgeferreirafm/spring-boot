package io.github.jffm.springboot.ext.hbase.model.serializer.avro;

import java.io.ByteArrayOutputStream;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.file.SeekableByteArrayInput;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.reflect.ReflectDatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificRecord;

import io.github.jffm.springboot.ext.hbase.model.serializer.ISerializer;
import io.github.jffm.springboot.ext.hbase.model.serializer.SerializationException;

public class AvroSerializer implements ISerializer{
	
	public static final String NAME = "AVRO";
	
	private Class type;
	
	private Schema schema;
	
	public AvroSerializer(Class type, Schema schema) {
		this.type = type;
		this.schema = schema;
	}
	
	@Override
	public byte[] serialize(Object value) throws SerializationException{		
		try{
			ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
			DatumWriter userDatumWriter = new ReflectDatumWriter(value.getClass());
			DataFileWriter dataFileWriter = new DataFileWriter(userDatumWriter);
			dataFileWriter.create(this.schema, arrayOutputStream);
			dataFileWriter.append(value);
			dataFileWriter.close();
			return arrayOutputStream.toByteArray();
		}catch (Exception e) {
			throw new SerializationException(e);
		}
	}

	@Override
	public Object deserialize(byte[] value) throws SerializationException{
		try{
			DatumReader userDatumWriter = new SpecificDatumReader(type);
			userDatumWriter.setSchema(this.schema);
			DataFileReader dataFileWriter = new DataFileReader(new SeekableByteArrayInput(value), userDatumWriter);
			return dataFileWriter.next();
		}catch (Exception e) {
			throw new SerializationException(e);
		}
	}

	@Override
	public String getFormat() {
		return NAME;
	}

	@Override
	public long getVersion() {
		return 0;
	}

}