package com.example;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.model.Cstmr;
import com.example.service.CstmrService;

@SpringBootApplication
@ComponentScan("com.example.service.impl, com.example.dao.impl")

public class SpringPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringPracticeApplication.class, args);
		CstmrService cusService = context.getBean(CstmrService.class);
		
		// Prepare Customer data for DB
		Random r = new Random();
		
		// Customer 1
		Cstmr cus_1 = new Cstmr();
		Long cus_1_id = r.nextLong();
		cus_1.setCustId(cus_1_id);
		cus_1.setName("demoCustomer_1");
		cus_1.setAge(30);
		
		// insert a Customer to DB
		cusService.insert(cus_1);
		
		System.out.println("APP Exit!!");
	}
}
