package com.solution.dog;

import com.solution.animal.Animal;

public class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("Dog sound is Bark");
	}

	@Override
	public void color() {
		System.out.println("Dog color is White");
	}

	@Override
	public void eat() {
		System.out.println("Dog eat Food");
	}
	
}
