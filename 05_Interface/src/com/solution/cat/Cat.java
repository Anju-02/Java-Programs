package com.solution.cat;

import com.solution.animal.Animal;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Cat sound is Meow");
	}

	@Override
	public void color() {
		System.out.println("Cat color is Black-White");
	}

	@Override
	public void eat() {
		System.out.println("Cat eat Food");
	}

}
