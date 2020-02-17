package basics;

// student class
public class InstanceVsStatic {
	int id;
	String name;
	String phoneNum;
	static String insName;

	
	
	public static void main(String[] args) {
		insName = "ssts";
		
		InstanceVsStatic obj1 = new InstanceVsStatic();
		obj1.id = 100;
		obj1.name = "surya";
		obj1.phoneNum = "9876543210";
		System.out.println("id = "+obj1.id+"\nname = "+obj1.name+"\nphone num = "+obj1.phoneNum+"\ninstitute name = "+insName);
		
		
		InstanceVsStatic obj2 = new InstanceVsStatic();
		obj2.id = 101;
		obj2.name = "rajesh";
		obj2.phoneNum = "9876599887";
		System.out.println("id = "+obj2.id+"\nname = "+obj2.name+"\nphone num = "+obj2.phoneNum+"\ninstitute name = "+insName);
		
		
		InstanceVsStatic obj3 = new InstanceVsStatic();
		obj3.id = 103;
		obj3.name = "kiran";
		obj3.phoneNum = "8796543210";
		System.out.println("id = "+obj3.id+"\nname = "+obj3.name+"\nphone num = "+obj3.phoneNum+"\ninstitute name = "+insName);
		
		System.out.println("********************************************************************************8");
		
		// modifying obj2 details
		obj2.name = "swathi";
		obj2.phoneNum = "6784412355";
		obj2.insName = "sunshine";
		
		System.out.println("id = "+obj1.id+"\nname = "+obj1.name+"\nphone num = "+obj1.phoneNum+"\ninstitute name = "+insName);
		System.out.println("id = "+obj2.id+"\nname = "+obj2.name+"\nphone num = "+obj2.phoneNum+"\ninstitute name = "+insName);
		System.out.println("id = "+obj3.id+"\nname = "+obj3.name+"\nphone num = "+obj3.phoneNum+"\ninstitute name = "+insName);
	}
}
