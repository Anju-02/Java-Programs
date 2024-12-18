package com.solution.rectangle;

import java.util.Scanner;

import com.solution.shapee.IShape;

public class Triangle implements IShape{

	private double s1;
    private double s2;
    private double s3;
    
    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
        
	@Override
	public double calculateArea() {
		 double s = (s1 + s2 + s3) / 2;
		return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
	}

	@Override
	public double calculatePerimeter() {
		 return s1 + s2 + s3;
	}
	
	

}
