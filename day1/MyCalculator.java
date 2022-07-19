//Write a program to make calculator

package com.globallogic.day1;

public class MyCalculator {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		char ch = '+';
		
		switch(ch){
		
		case '+':
			System.out.println("Addition is : "+ (a+b));
			break;
			
		case '-':
			System.out.println("Subtraction is : "+ (a-b));
			break;
			
		case '*':
			System.out.println("Addition is : "+ (a*b));
			break;
			
		case '/':
			System.out.println("Addition is : "+ (a/b));
			break;
			
		default:
			System.out.println("Nothing to calculate");
			break;
		}
	}
}
