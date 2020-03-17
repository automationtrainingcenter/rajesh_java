package methods_and_constructors;

public class ConstructorDemoTwo {

	int id;
	String name;
	String course;
	double fee;
	String address;
	long phNum;
	
	// default constructorx
	public ConstructorDemoTwo() {
		id = 100;
		name = "surya";
		course ="python";
		fee = 6000.00;
		address = "lingampalli";
		phNum = 1111111111l;
	}
	
	
	// parameterized constructor
	public ConstructorDemoTwo(int id, String name, String course, double fee) {
		this();
		this.id = id;
		this.name = name;
		this.course = course;
		this.fee = fee;
	}

	
	// constructor overloading
	// changing number of arguments
	public ConstructorDemoTwo(int id, String name, String course, double fee, String address) {
		this(id, name, course, fee);
		this.address = address;
	}
	
	// changing type of arguments
	public ConstructorDemoTwo(int id, String name, String course, double fee, long phNum) {
		this(id, name, course, fee);
		this.phNum = phNum;
	}
	
	public ConstructorDemoTwo(int id, String name, String course, double fee, String address, long phNum) {
		this(id, name, course, fee, address);
		this.phNum = phNum;
		
	}
	
	public void display() {
		System.out.println("name = " + name + "\tcourse = " + course + "\tfee = " + fee+"\taddress = "+address+"\tphone num = "+phNum);
	}

	public static void main(String[] args) {
		ConstructorDemoTwo s1 = new ConstructorDemoTwo();
		s1.display();
		
		ConstructorDemoTwo s2 = new ConstructorDemoTwo(101, "siva", "selenium", 8000.00);
		s2.phNum = 9876543122l;
		s2.display();
		
		ConstructorDemoTwo s3 = new ConstructorDemoTwo(102, "rajesh", "java", 4000.00, "miyapur");
		s3.display();
		
		ConstructorDemoTwo s4 = new ConstructorDemoTwo(103, "swathi", "testing", 10000.00, 9876543210l);
		s4.display();
		
		ConstructorDemoTwo s5 = new ConstructorDemoTwo(104, "vani", "django", 6000.00, "chandanagar", 8971122330l);
		s5.display();
		
		
	}

}
