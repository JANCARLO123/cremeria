package com.jcpv.cremeria;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

//@ComponentScan("com.example.base")
//@EntityScan("org.example.base.entities")
public class CremeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CremeriaApplication.class, args);
	}
}
