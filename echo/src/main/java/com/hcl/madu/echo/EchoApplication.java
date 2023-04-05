package com.hcl.madu.echo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import main.java.com.hcl.madu.echo.EchoController;

@SpringBootApplication
@ComponentScan(basePackageClasses = EchoController.class)
public class EchoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchoApplication.class, args);
	}

}
