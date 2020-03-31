package abstraction;
/*
 * From Java 8 Onwards interfaces can have methods with definitions also
 * 
 */

public interface Java8Interface {
	
	// abstract method
	public void methodOne();
	
	// concrete static method
	public static void methodTwo() {
		System.out.println("static method two defenition in interface");
	}
	
	// concrete default method
	public default void methodThree() {
		System.out.println("default method three definition in interface");
	}
	

}
