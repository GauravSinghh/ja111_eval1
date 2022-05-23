package com.masai;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		Car car= new Car("Harrier","Tata","black",new Engine(10000,110,"tata",true));
		
		System.out.println("Car Model : "+car.getModel());
		System.out.println("Car companyName : "+car.getCompanyName());
		System.out.println("Car color : "+car.getColor());
		System.out.println("Car RPM : "+car.engine.getRmp());
		
		System.out.println("Car power : "+car.engine.getPower());
		
		System.out.println("Car Engine Manufacturer : " +car.engine.getManufacturer());
		System.out.println("Car hasTurbo : "+car.engine.getHasTurbo());
	
		
		
	}

}
