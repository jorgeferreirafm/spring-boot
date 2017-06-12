package io.github.jffm.springboot.ext.hbase;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix="extension.datasources.hbase")
public class HBaseProperties {
	
	public static class Zookeeper {
		
		@Getter
		@Setter
		@NotNull
		private String quorum;
		
		@NestedConfigurationProperty
		@Getter
		@Setter
		private Property property = new Property();
		
		public static class Property {
			
			@Getter
			@Setter
			@Min(0)
			@Max(65535)
			private Integer clientPort = 2181;
			
		}
		
	}
	
	@NestedConfigurationProperty
	@Getter
	@Setter
	private Zookeeper zookeeper = new Zookeeper();

}
