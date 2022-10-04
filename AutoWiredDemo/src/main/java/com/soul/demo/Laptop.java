package com.soul.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	@Autowired
	private Aliens alien;
	
	public void code() {
		alien.compile();
	}
}
