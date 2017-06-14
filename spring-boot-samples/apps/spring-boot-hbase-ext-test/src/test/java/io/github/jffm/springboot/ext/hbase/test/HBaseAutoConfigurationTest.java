package io.github.jffm.springboot.ext.hbase.test;


import static org.junit.Assert.*;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseTestingUtility;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import io.github.jffm.springboot.ext.hbase.HBaseAutoConfiguration;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=HBaseTestApplication.class)
public class HBaseAutoConfigurationTest {

	
	@Autowired
	HBaseAutoConfiguration hbaseAutoConfiguration;
	
	@Autowired
	Configuration configuration;

	//@Autowired
	//private HbaseTemplate hbaseTemplate;
	
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
	public void testHBaseAvailability() throws Exception {
		assertEquals("127.0.0.1", configuration.get("hbase.zookeeper.quorum"));
		//assertEquals("172.17.0.1", hbaseTemplate.getConfiguration().get("hbase.zookeeper.quorum"));
		
        Admin admin = ConnectionFactory.createConnection(configuration).getAdmin();
        
		
	}

}