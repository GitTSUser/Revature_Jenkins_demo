package com.rev.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rev.app.controller.FlipKart;

@SpringBootApplication
public class AppOneApplication implements CommandLineRunner{

	@Autowired
	private ApplicationContext ac;

	public static void main(String[] args) {
		SpringApplication.run(AppOneApplication.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {

		FlipKart fk=ac.getBean(FlipKart.class);		
		
		fk.placeOrder("Lenovo Lappy", "Madhapur");
		System.out.println("Order Placed Successful");	
		
	}
}