package io.github.jffm.springboot.ext.hbase;

import static org.junit.Assert.*;


import org.apache.hadoop.conf.Configuration;
import org.junit.After;
import org.junit.Test;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class HBaseAutoConfigurationTest {

	private AnnotationConfigApplicationContext context;		

	@After
	public void close() {
		if (this.context != null) {
			this.context.close();
		}
	}

	@Test
	public void clientExists() {
		System.setProperty("extension.datasources.hbase.zookeeper.quorum", "127.0.0.1");
		this.context = new AnnotationConfigApplicationContext(PropertyPlaceholderAutoConfiguration.class, HBaseAutoConfiguration.class);
		assertEquals(1, this.context.getBeanNamesForType(HBaseAutoConfiguration.class).length);
		assertEquals(1, this.context.getBeanNamesForType(Configuration.class).length);
		assertEquals(1, this.context.getBeanNamesForType(HBaseProperties.class).length);
	}

	
	@Test
	public void optionsAdded() {
		System.setProperty("extension.datasources.hbase.zookeeper.quorum", "127.0.0.1");
		this.context = new AnnotationConfigApplicationContext(PropertyPlaceholderAutoConfiguration.class, HBaseAutoConfiguration.class);
		
		HBaseProperties baseProperties =  this.context.getBean(HBaseProperties.class);
				
		assertEquals("127.0.0.1", baseProperties.getHbase().getZookeeper().getQuorum());
	}

}