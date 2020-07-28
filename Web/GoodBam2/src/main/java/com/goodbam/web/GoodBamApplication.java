package com.goodbam.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "com.goodbam.web.dao")
public class GoodBamApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodBamApplication.class, args);
	}

}
