package io.github.jffm.springboot.ext.hbase;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HBaseConfiguration.class)
@EnableConfigurationProperties(HBaseProperties.class)
public class HBaseAutoConfiguration {

	@Autowired
	private HBaseProperties hbaseProperties;

	@Bean
	@ConditionalOnMissingBean
	public org.apache.hadoop.conf.Configuration hbaseConfiguration() {
		org.apache.hadoop.conf.Configuration configuration = org.apache.hadoop.hbase.HBaseConfiguration.create();
		configuration.set(HConstants.ZOOKEEPER_QUORUM, hbaseProperties.getZookeeper().getQuorum());
		configuration.setInt(HConstants.ZOOKEEPER_CLIENT_PORT, hbaseProperties.getZookeeper().getProperty().getClientPort());
		return configuration;
	}

}