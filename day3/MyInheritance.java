package day3;

class Employee{
	String name;
	int id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void printA(){
		System.out.println("id: "+id+" name: "+name);
	}
}

class Teacher extends Employee{
	String subject;
	
	public Teacher(String subject, String name, int id){
		super(name,id);
		this.subject = subject;
	}
	
	public void printB(){
		System.out.println("id: "+id+" name: "+name+" subject: "+subject);
	}
}

public class MyInheritance {
	public static void main(String[] args) {
		Teacher ob1 = new Teacher("maths", "Sarika", 93);
		ob1.printA();
		ob1.printB();
	}
}


