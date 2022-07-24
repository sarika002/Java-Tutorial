package day3;

class Worker{
	
	//static variable
	static String companyName;
	
	//instance variable
	String name;
	int id;
	
	public Worker(String name, int id){
		this.name =name;
		this.id = id;
	}
	
	// static block
	static{
		System.out.println("Hello all!");
	}
	
	//static method
	public static void setCompanyName(String name){
		companyName = name;
	}
	
	public void display(){
		System.out.println("Name: "+this.name+" id: "+this.id+" Company Name: "+companyName);
	}
}


public class StaticClass {
	public static void main(String[] args) {
		Worker.setCompanyName("Global Logic");
		
		Worker emp = new Worker("Sarika", 1234);
		emp.display();
	}
}


