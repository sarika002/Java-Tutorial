package com.globallogic.day2;

class Student{
	private String name;
	private int id;
	private int age;
	private String address;
	private String city;
	
	//parameterized constructor
	public Student(String name, int id, int age, String address, String city) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.address = address;
		this.city = city;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", address=" + address + ", city=" + city
				+ "]";
	}
}

class Employee{
	private int id;
	private String empName;
	private String company;
	private int phoneNumber;
	private double salary;
	
	//parameterized constructor
	public Employee(int id, String empName, String company, int phoneNumber, double salary) {
		this.id = id;
		this.empName = empName;
		this.company = company;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", company=" + company + ", phoneNumber=" + phoneNumber
				+ ", salary=" + salary + "]";
	}
}

class Car{
	private String name;
	private int modelNumber;
	private String company;
	private double price;
	private String type;
	
	//parameterized constructor
	public Car(String name, int modelNumber, String company, double price, String type) {
		this.name = name;
		this.modelNumber = modelNumber;
		this.company = company;
		this.price = price;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", modelNumber=" + modelNumber + ", company=" + company + ", price=" + price
				+ ", type=" + type + "]";
	}
}
 
class Mobile{
	private String brand;
	private String model;
	private double price;
	private int memory;
	private int cameraResolution;
	
	//parameterized constructor
	public Mobile(String brand, String model, double price, int memory, int cameraResolution) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.memory = memory;
		this.cameraResolution = cameraResolution;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getCameraResolution() {
		return cameraResolution;
	}

	public void setCameraResolution(int cameraResolution) {
		this.cameraResolution = cameraResolution;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", price=" + price + ", memory=" + memory
				+ ", cameraResolution=" + cameraResolution + "]";
	}
}

class Dog{
	private String name;
	private String breed;
	private int age;
	private String Colour;
	private String gender;
	
	//parameterized constructor
	public Dog(String name, String breed, int age, String colour, String gender) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.Colour = colour;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String colour) {
		Colour = colour;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + ", Colour=" + Colour + ", gender=" + gender
				+ "]";
	}
}


public class MyClass {
	public static void main(String[] args) {
		Student ob = new Student("Sarika", 93, 22, "Maruti Estate", "Agra");
		System.out.println(ob);
		
		Employee emp = new Employee(101, "Sarika", "Global Logic", 1234567890, 550000.00);
		System.out.println(emp);
		
		Car car1 = new Car("Thar", 1234, "Hyundai", 1000000.00, "Fuel-driven");
		System.out.println(car1);
		
		Mobile mob = new Mobile("Redmi", "Note 11", 16000.00, 128, 50);
		System.out.println(mob);
		
		Dog dg1 = new Dog("Scooby", "Pomarian", 10, "White", "male");
		System.out.println(dg1);
	}
}


