package com.hcl.madu.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import main.java.com.hcl.madu.hello.HelloController;

@SpringBootApplication
@ComponentScan(basePackageClasses = HelloController.class)
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
