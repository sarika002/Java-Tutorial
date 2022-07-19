package com.globallogic.day2;

public class Swap {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a after swapping: "+a);
		System.out.println("b after swapping: "+b);

	}

}
