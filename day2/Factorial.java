package com.globallogic.day2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Enter any number: ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int s=1;
		
		for(int i=1; i<=num; i++){
			s*=i;
		}
		System.out.println("Factorial of "+num+" is: "+s);
	}
}
