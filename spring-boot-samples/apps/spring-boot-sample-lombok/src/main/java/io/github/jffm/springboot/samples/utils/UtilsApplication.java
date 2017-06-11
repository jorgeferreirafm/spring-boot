package io.github.jffm.springboot.samples.utils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UtilsApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(UtilsApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter("spring-boot-samples-helloworld.pid"));
		springApplication.run(args);
	}
	
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	
}
