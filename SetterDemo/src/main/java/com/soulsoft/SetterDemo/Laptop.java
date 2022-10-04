package com.soulsoft.SetterDemo;

public class Laptop {

	private String name;

	private Alien alien;
	
	
	public Laptop(String name) {
		super();
		this.name = name;
		System.out.println("Value Assigned");
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Alien getAlien() {
		return alien;
	}



	public void setAlien(Alien alien) {
		this.alien = alien;
	}



	public void show() {
		System.out.println("Coding is really amazing....");
		System.out.println("The new laptop name:"+getName());
		alien.code();
	}



	
	
}
