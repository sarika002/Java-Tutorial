package day3;

class GrandParent{
	String name;
	String familyName;
	double netWorth;
	
	
	public GrandParent(String name, String familyName, double netWorth) {
		this.name = name;
		this.familyName = familyName;
		this.netWorth = netWorth;
	}
	
	public void display(){
		System.out.println("This is GrandParent Class");
		System.out.println("name: "+name+" familyName: "+familyName+" netWorth: "+netWorth);
	}
}

class Parent extends GrandParent{
	String parentName;
	
	public Parent(String parentName, String name, String familyName, double netWorth){
		super(name, familyName, netWorth);
		this.parentName = parentName;
	}
	
	public void display1(){
		System.out.println("This is Parent Class");
		System.out.println("name: "+name+" familyName: "+familyName+" parentName: "+parentName+" netWorth: "+netWorth);
	}
}

class Child extends Parent{
	String childName;
	
	public Child(String name, String familyName, double netWorth, String parentName, String childName){
		super(parentName, name, familyName, netWorth);
		this.childName = childName;
	}
	
	public void display2(){
		System.out.println("This is child Class");
		System.out.println("name: "+name+" familyName: "+familyName+" parentName: "+parentName+" childName: "+childName+" netWorth: "+netWorth);
	}
}


public class MultiLevel {
	public static void main(String[] args) {
		Child ob = new Child("Om Prakash", "Sharma", 10000000.00, "Shiva", "Ram");
		ob.display();
		ob.display1();
		ob.display2();
	}
}


