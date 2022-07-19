//Write a program to give the color code and print the color name using if-else

package com.globallogic.day1;

public class ColourCode {

	public static void main(String[] args) {
		int colorNumber = 1;
		
		if(colorNumber == 1)
			System.out.println("White");
		else
			if(colorNumber == 2)
				System.out.println("Black");
		else
			if(colorNumber == 3)
				System.out.println("Purple");
		else
			if(colorNumber == 4)
				System.out.println("Pink");
		else
			if(colorNumber == 5)
				System.out.println("Green");
		else
			if(colorNumber == 6)
				System.out.println("Blue");
	}

}
