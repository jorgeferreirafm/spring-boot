package io.github.jffm.springboot.ext.hbase.model.repository;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseTestingUtility;
import org.apache.hadoop.hbase.util.Bytes;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.github.jffm.springboot.ext.hbase.model.repository.avro.User;
import io.github.jffm.springboot.ext.hbase.model.serializer.SerializationException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleSpringBootApp.class)
public class AbstractHBaseRepositoryTest {

	@Autowired
	private AbstractHBaseRepository<User> repository;

	@Autowired
	private AbstractHBaseRepository<io.github.jffm.springboot.ext.hbase.model.repository.Test> repository1;
	
	private static HBaseTestingUtility utility;

	@BeforeClass
	public static void setup() throws Exception {
		utility = new HBaseTestingUtility();
		Configuration conf = utility.getConfiguration();
		// Tune down the connection thread pool size
		conf.setInt("hbase.hconnection.threads.core", 5);
		conf.setInt("hbase.hconnection.threads.max", 10);
		// Tunn down handler threads in regionserver
		conf.setInt("hbase.regionserver.handler.count", 10);

		// Set to random port
		conf.setInt("hbase.master.port", 0);
		conf.setInt("hbase.master.info.port", 0);
		conf.setInt("hbase.regionserver.port", 0);
		conf.setInt("hbase.regionserver.info.port", 0);

		conf.set("test.hbase.zookeeper.property.clientPort", "2181");

		System.setProperty("hadoop.home.dir", "/");
		utility.startMiniCluster();
	}

	@Test
	public void testRecordCreation() throws IOException, SerializationException {

		User user = new User();
		user.setName("Test");
		user.setEmail("Test");
		user.setPassword("Test");
		
		repository.save(Bytes.toBytes(user.getName().toString()), user);

		User entity = repository.get(Bytes.toBytes(user.getName().toString()));

	}
	

	@Test
	public void testRecordCreation2() throws IOException, SerializationException {

		io.github.jffm.springboot.ext.hbase.model.repository.Test user = new io.github.jffm.springboot.ext.hbase.model.repository.Test();
		user.setName("Test");
		
		
		repository1.save(Bytes.toBytes(user.getName().toString()), user);

		io.github.jffm.springboot.ext.hbase.model.repository.Test entity = repository1.get(Bytes.toBytes(user.getName().toString()));
		
		System.out.println(entity.getName());

	}

}