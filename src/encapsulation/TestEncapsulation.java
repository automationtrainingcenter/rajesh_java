package encapsulation;

public class TestEncapsulation {
	
	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo(101, "surya", "tester", 500000.00, "lingampalli", 9876543210l);
		obj.setPassword("1234");
		
		System.out.println(obj.getName());
		System.out.println(obj.getSalary());
		obj.setSalary(400000.00);
		System.out.println(obj.getSalary());
		
		obj.setPassword("9876");
	}

}
