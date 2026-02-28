package com.rev.app.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class BlueDart implements ICourierService{

	@Override
	public void deliverItem(String item, String address) {
	
		
		System.out.println("item: "+item+" has beed delivered at "+address);
		
		
	}
}