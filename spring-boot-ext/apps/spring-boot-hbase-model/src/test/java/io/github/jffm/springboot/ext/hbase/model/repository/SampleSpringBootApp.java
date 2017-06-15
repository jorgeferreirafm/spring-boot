package io.github.jffm.springboot.ext.hbase.model.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.jffm.springboot.ext.hbase.model.repository.avro.User;
import io.github.jffm.springboot.ext.hbase.model.serializer.SerializationFacory;
import io.github.jffm.springboot.ext.hbase.model.serializer.avro.AvroReflectSerializer;
import io.github.jffm.springboot.ext.hbase.model.serializer.avro.AvroSerializer;

@SpringBootApplication
@Configuration
public class SampleSpringBootApp {
	

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SampleSpringBootApp.class);
		ConfigurableApplicationContext context = springApplication.run(args);		
//		context.getBean(UserService.class).query();
		 
	}
	
	@Bean
	public AbstractHBaseRepository<User> bean() {
		AbstractHBaseRepository<User> repository = new AbstractHBaseRepository<User>("User", User.class);
		repository.setArgument(User.SCHEMA$);
		repository.setFormat(AvroSerializer.NAME);
		repository.setVersion(0l);
		return repository;
	}
	
	@Bean
	public AbstractHBaseRepository<Test> bean2() {
		AbstractHBaseRepository<Test> repository = new AbstractHBaseRepository<Test>("Test", Test.class);
		repository.setFormat(AvroReflectSerializer.NAME);
		repository.setVersion(0l);
		return repository;
	}
	
	@Bean
	public SerializationFacory factory (){
		return new SerializationFacory();
	}

}
