package com.globallogic.day2;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		
		System.out.print("Enter the String: ");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.print("Reversed String: ");
		
		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i)+"");
		}
	}
}
