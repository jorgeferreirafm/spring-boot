package io.github.jffm.springboot.ext.hbase.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HBaseTestApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(HBaseTestApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter("spring-boot-hbase-ext-test.pid"));
		springApplication.run(args);
	}
	
	

	
}
