package com.solution.main;

import java.util.Scanner;

class NegativeException extends Exception {
	
    public NegativeException(String message) {
        super(message);
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter number: ");
            int number = sc.nextInt();

            if (number < 0) {
                throw new NegativeException("There is Negative number entered.");
            }

            System.out.println("You enterd: " + number);
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
         } finally {
            sc.close();
            System.out.println("Program Excution Completed ");
        }
    }
}
