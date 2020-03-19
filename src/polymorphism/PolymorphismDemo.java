package polymorphism;
/*
 * Polymorphism means one object behaving differently based on input or based on environment
 * 
 * We have two types of polymorphism
 * 
 * 1. Compile time polymorphism:
 * 	it is also known as method overloading
 * We can achieve method overloading within a class either
 * 1. by changing number of inputs of a method or
 * 2. by changing type of inputs
 * 3. by changing sequence of inputs 
 * 
 * Note: By changing only the return type of a method we can't achieve method overloading
 * 
 * 2. Runtime polymorphism:
 * 	it is also known as method overriding
 * 	we can achieve method overriding using inheritance. We can override a method of parent class within 
 * child class.
 *
 */
public class PolymorphismDemo {
	public static void main(String[] args) {
		// compile time polymorphism
		CompileTimePolyDemo obj = new CompileTimePolyDemo();
		obj.add("10", 20);
		obj.add(10, "20");
		obj.add(10, 20);
		obj.add("10", 10, 20);
		
		
		// runtime polymorphism
		RunTimePolyParent pObj = new RuntimePolyChild();
		pObj.add("10", 20);
		
	}

}
