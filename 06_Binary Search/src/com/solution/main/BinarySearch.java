package com.solution.main;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int[] arr , int target) {
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			
			int mid = (left+right)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] sortedArray = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.print("Enter target value: ");
		int target = sc.nextInt();
		
		int result = binarySearch(sortedArray,target);
		
		if(result != -1) {
			System.out.println("Target Found at index: "+result);
		}
		else {
			System.out.println("Target not found");
		}
	}

}


