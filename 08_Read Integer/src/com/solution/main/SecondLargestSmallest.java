package com.solution.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondLargestSmallest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> no = new ArrayList<>();
		
		System.out.println("Enter integer(type 'done' to finish): ");
		
		while(sc.hasNextInt()){
			no.add(sc.nextInt());
		}
		
		
		if(no.size() < 2) {
			System.out.println("At least two no.s are required");
			return;
		}
		
		Collections.sort(no);
		
		int secondSmallest = no.get(1);
		int secondLargest = no.get(no.size()-2);
		
		System.out.println("Second smallest: "+secondSmallest);
		System.out.println("Second largest: "+secondLargest);
	}

}
