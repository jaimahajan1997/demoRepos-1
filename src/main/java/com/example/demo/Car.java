package com.example.demo;

public class Car {
	String name;
	int price;
	
	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public boolean ObjectCreated() {
		return true;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



}
