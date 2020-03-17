package inheritance;

public class InheritanceDemo {
	
	public static void main(String[] args) {
		// create an object of Parent class
		Parent p = new Parent();
		p.methodOne();
		
		System.out.println("*******************************************************");
		// single inheritance
		// create an object of ChildOne class
		ChildOne c1Obj = new ChildOne();
		c1Obj.methodTwo(); // ChildOne
		c1Obj.methodOne(); // Parent
		
		
		System.out.println("*******************************************************");
		// multilevel inheritance
		// Parent -> child -> sub child
		SubChild scObj = new SubChild();
		scObj.methodThree(); // SubChild
		scObj.methodTwo(); // ChildOne
		scObj.methodOne(); // Parent
		
		
		
		System.out.println("*******************************************************");
		// hierarchical inheritance
		ChildTwo c2Obj = new ChildTwo();
		c2Obj.methodFour(); // ChildTwo
		c2Obj.methodOne(); // Parent
		
		
		System.out.println("*******************************************************");
		// Parameterised constructor in parent class
		// if Parent class contains any parametrised constructor then child class must have
		// that same parameterised constructor
//		ParentParaCons pcObj = new ParentParaCons(101,  "rajesh");
		
		ChildParaCons ccObj = new ChildParaCons(101, "swathi");
		
		
		System.out.println("*******************************************************");
		/*
		 * Whenever we create an object of child class using child class constructor 
		 * it will create object for both child class as well as Parent class.
		 * 
		 * we can create an object reference to the Parent class and object 
		 * creation to any one of the child class
		 */
		Parent pc = new ChildOne();
		pc.methodOne();
		ChildOne c1 = (ChildOne) pc;
		c1.methodTwo();
//		c1.methodOne();
	}

}
