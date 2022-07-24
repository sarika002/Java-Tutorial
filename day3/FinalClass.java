package day3;

//final class
final class Area{
	
	//final variable
	final double pi;
	
	//final variable initializer block
	{
		pi = 3.14;
	}
	
	//instance variable
	int radius;
	
	public Area(int radius){
		this.radius = radius;
	}
	
	//final method
	public void calculate(){
		double result = pi*this.radius*this.radius;
		System.out.println("Area of Circle: "+result);
	}
	
}

public class FinalClass {
	public static void main(String[] args) {
		Area ar = new Area(14);
		ar.calculate();
	}
}
