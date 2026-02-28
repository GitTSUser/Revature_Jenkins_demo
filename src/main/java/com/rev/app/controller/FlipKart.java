package com.rev.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.rev.app.service.ICourierService;

@Component
public class FlipKart {
	
	@Autowired
	private ICourierService courierService;		

	public void  placeOrder(String item,String address) {
		System.out.println("placing order for "+item);
		courierService.deliverItem(item, address);			
	}	
}