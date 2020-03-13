package methods_and_constructors;

public class ConstructorDemoTwo {

	int id;
	String name;
	String course;
	double fee;
	String address;
	long phNum;
	
	public ConstructorDemoTwo() {
		id = 100;
		name = "surya";
		course ="python";
		fee = 6000.00;
		address = null;
		phNum = 0;
	}
	
	public ConstructorDemoTwo(int id, String name, String course, double fee) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.fee = fee;
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
	}

}
