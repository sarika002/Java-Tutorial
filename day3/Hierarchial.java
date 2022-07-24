package day3;

class Volume{
	int length;
	int breadth;
	int height;
	String type;
	
	public Volume(int length, int breadth, int height, String type) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		this.type = type;
	}
	
	public void calculate(){
		if(type == "square")
			System.out.println("Volume of Square: "+ (length*breadth*height));
		else
			System.out.println("Volume of Rectangle: "+ (length*breadth*height));
	}
}

class Square extends Volume{
	public Square(int length, int breadth, int height, String type){
		super(length, breadth, height, type);
	}
}

class Rectangle extends Volume{
	public Rectangle(int length, int breadth, int height, String type){
		super(length, breadth, height, type);
	}
}

public class Hierarchial {
	public static void main(String[] args) {
		Square sq = new Square(5,5,5,"square");
		sq.calculate();
		
		Rectangle rt = new Rectangle(10,5,5,"rectangle");
		rt.calculate();
	}
}






