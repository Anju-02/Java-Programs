package com.solution.main;

import com.solution.cat.Cat;
import com.solution.dog.Dog;

public class Test {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.color();
		d.eat();
		d.sound();
		
		System.out.println();
		
		Cat c = new Cat();
		c.color();
		c.eat();
		c.sound();
	}

}
