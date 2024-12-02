package com.solution.main;

abstract class Vehicle {
	
	abstract void start();
	abstract void stop();
	void color() {
		System.out.println("This vehicle is Black ");
	}

}

class Car extends Vehicle{

	@Override
	void start() {
		System.out.println("Car is starting");		
	}

	@Override
	void stop() {
		System.out.println("Car is stop");
	}
}

class Bicycle extends Vehicle{

	@Override
	void start() {
		System.out.println("Bicycle is start");
	}

	@Override
	void stop() {
		System.out.println("Bicycle is stop");
		
	}
	
}
public class Test {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.start();
		c.stop();
		c.color();
		
		Bicycle b = new Bicycle();
		b.start();
		b.stop();
		b.color();
	}

}
