package io.github.jffm.springboot.samples.checkerframework;

import static java.lang.System.out;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CheckerFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(CheckerFrameworkApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter("spring-boot-samples-checkerframework.pid"));
		springApplication.run(args);
		
		//final String nullStr = null;
		final String nullStr = "value";
		printNonNullToString(nullStr);
	}

	public static void printNonNullToString(@NonNull final Object object) {
		out.println(object.toString());
	}

}
