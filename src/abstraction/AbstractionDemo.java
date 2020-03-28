package abstraction;

import abstraction.Outer.Inner;

/*
 * Abstraction means a plan or template to create a class
 * Abstraction means hiding the implementation details of methods
 * we have two to implement abstraction
 * 
 * 1. abstract classes
 * 		It is class which contains at least one abstract method and declared using "abstract" keyword. 
 * Abstract method is a method with declaration only. 
 * A normal Java class "extends" this abstract class and provides implementation to the abstract methods.
 * If in case this normal Java class failed to provide implementation to any one abstract method then that
 * normal Java class also becomes abstract class.
 * An abstract class can extends another abstract class or normal java class and it can implement an interface
 * Abstract class can contain both abstract methods and concrete methods.
 * 
 * 
 * 2. Interfaces
 * 		In interface all the methods are public and abstract by default. A normal Java class "implements" 
 * interface and provides implementation to the abstract methods.
 * By default all the methods in Interface are public and abstract
 * By default all the variables of interface are public, static and final
 * An interface can extends multiple interfaces and it can't implement another interface
 * A class can implement multiple interfaces and can only extends one normal class or one abstract class
 * 
 * From Java 8 onwards interface allows concrete methods
 * These concrete methods are either static methods or "default" methods
 * We can access default method using interface reference and static method using interface name
 * we can override a default method of interface in implementation classes but
 * we can't override static method of interface
 * we can't create an instance of either abstract class or interface but we can create object reference,
*/

public class AbstractionDemo {
	
	public static void main(String[] args) {
		// abstract class
		AbstractClassDemo pObj = new AbstractClassChild();
		pObj.methodOne();
		pObj.methodTwo();
		pObj.methodThree();
		System.out.println("************************************");
		
		// single interface implemented by two classes 
		MyInterface iObj = new MyInterfaceImplOne();
		iObj.methodOne();
		iObj.methodTwo();
		
		iObj = new MyInterfaceImplTwo();
		iObj.methodOne();
		iObj.methodTwo();
		System.out.println("************************************");
		
		
		// single class implementing multiple interfaces
		InterfaceOne i1obj = new MultiInterfaceImpl();
		i1obj.methodOne(); // InterfaceOne
		i1obj.method();
		
		// calling InterfaceTwo method by type casting InterfaceOne object reference to the InterfaceTwo object reference
		InterfaceTwo i2obj = (InterfaceTwo) i1obj;
		i2obj.methodTwo(); // InterfaceTwo
		i2obj.method();
		
		System.out.println("************************************");
		// inner interfaces
		Outer oObj = new OuterInnerImpl();
		oObj.oMethod();
		
		// calling inner interface method by type casting outer interface object reference to the inner interface
		// object reference
//		Outer.Inner inObj = (Outer.Inner) oObj;
		Inner inObj = (Inner) oObj;
		inObj.iMethod();
		
		// calling inner interface method using outer interface method which will return inner interface object reference
//		Inner innerObj = oObj.method();
//		innerObj.iMethod();
		oObj.method().iMethod(); // Object chaining
	}

}
