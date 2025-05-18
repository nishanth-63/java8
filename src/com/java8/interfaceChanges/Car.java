package com.java8.interfaceChanges;

public class Car implements Vehicle{

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		System.out.println("Car Wash");
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Car Price is 20,00,000/-");
	}
	public static void main(String[] args) {
		Car car=new Car();
		car.wash();
		car.price();
		System.out.println(Vehicle.passengers());
		car.colour();
	}

}
class Bike implements Vehicle{

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		System.out.println("Bike Wash");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Bike Price is 2,00,000/-");
	}
	
}
class Bus implements Vehicle{

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		System.out.println("Bus Wash");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Bus Price is 40,00,000/-");
	}
	
}
