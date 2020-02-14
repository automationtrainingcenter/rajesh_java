package basics;

public class TestVariablesDemo {
	
	public static void main(String[] args) {
		// access instance and static variables of VariablesDemo class
		// accessing static variable of VariablesDemo class
		VariablesDemo.sVar = 1000;
		System.out.println(VariablesDemo.sVar);
		
		
		// accessing instance variable of VariablesDemo class
		VariablesDemo obj = new VariablesDemo();
		obj.iVar = 3000;
		System.out.println(obj.iVar);
		
		
		
	}

}
