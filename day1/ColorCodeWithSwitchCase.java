package com.globallogic.day1;

public class ColorCodeWithSwitchCase {
	
	public static void main(String[] args) {
		
		int colourNumber = 1;
		
		switch(colourNumber){
		
		case 1:
			System.out.println("Red");
			break;
		
		case 2:
			System.out.println("Blue");
			break;
			
		case 3:
			System.out.println("Green");
			break;
			
		case 4:
			System.out.println("Pink");
			break;
			
		case 5:
			System.out.println("Yellow");
			break;
			
		case 6:
			System.out.println("Orange");
			break;
			
		case 7:
			System.out.println("White");
			break;
			
		default:
			System.out.println("Incorrect Choice");
			break;
		}
	}
}
