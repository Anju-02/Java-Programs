package com.solution.main;

import com.solution.circle.Circle;
import com.solution.rectangle.Triangle;
import com.solution.shapee.IShape;

public class Test {

	public static void main(String[] args) {

		 // Create a Circle object
        IShape circle = new Circle(5);
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Create a Triangle object
        IShape triangle = new Triangle(3, 4, 5);
        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
		
	

}
