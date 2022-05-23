package com.masai;

public class Car {

	String companyName;
	String Color;
	Engine engine;
	String model;
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	
	public Car(String model,String color,String companyName ,Engine engine) {
		
		setModel( model);
		setColor(color);
		setCompanyName(companyName);
		 setEngine( engine);
		
	}
	public Car() {
		System.out.println("enter valid details");
	}

}
