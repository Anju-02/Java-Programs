package com.solution.main;

class Parent{
	
	public Parent() {
		System.out.println("This is the Parent Class");
	}
}

class Child extends Parent{
	
	public Child() {
		System.out.println("This is Child Class");
	}
}
public class Test {

	public static void main(String[] args) {
    	Child c = new Child();
	 //Parent p = new Parent();
	}

}
