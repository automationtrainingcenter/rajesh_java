package finalkeyword;
/*
 * We can declare a variable or method or class as final.
 * If we declare a variable as final we can't change it's value i.e. that variable is a constant
 * If we declare a method as final in a parent class, we can't override that class in child classes
 * If we declare a class as final we can't create child classes to that class but it
 * can have a parent class
 */

public class FinalKeywordDemo {
	
	// final variable
	public static final int fVar = 10;
	
	public static void main(String[] args) {
		System.out.println(fVar);
//		fVar = 30; // final variables does not allow assignment
		
		
		// final method
		FinalMethodChild fcObj = new FinalMethodChild();
		fcObj.methodOne(); // Child class
		fcObj.methodTwo(); // Parent class
		
		
		
		
	}

}
