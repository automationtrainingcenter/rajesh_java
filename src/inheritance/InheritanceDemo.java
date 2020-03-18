package inheritance;
/*
 * Acquiring properties and methods of one class (super or parent or base) in 
 * another class (child or sub)
 * 
 * The purpose of inheritance is code reusability
 * 
 * To achieve inheritance we are going to use extends keyword
 * child class extends parent class
 * 
 * class Child extends Parent{ }
 * 
 * There are 5 types of inheritance
 * 
 * 1. single
 * 2. multilevel
 * 3. hierarchical
 * 4. multiple
 * 5. hybrid
 * 
 * Java supports only 1, 2 and 3 types of inheritance and it does not support
 * multiple and hybrid inheritance
 * 
 * single: single parent and single child
 * 
 * class A {
 *  public methodOne(){}
 * }
 * 
 * class B extends A{
 * 	public methodTwo(){ }
 * }
 * 
 * 
 * A a = new A();
 * a.methodOne();
 * 
 * 
 * B b = new B();
 * b.methodTwo();
 * b.methodOne();
 * 
 * 
 * 
 * 2. Multilevel: Parent and it's child and it's child and so on
 * Parent -> Child -> GrandChild
 * 
 * class A {
 *  	public methodOne(){}
 * }
 * 
 * class B extends A{
 * 		public methodTwo(){ }
 * }
 * 
 * class C extends B {
 * 		public methodThree(){ }
 * }
 * 
 * A a = new A();
 * a.methodOne();
 * 
 * B b = new B();
 * b.methodTwo();
 * b.methodOne();
 * 
 * C c = new C();
 * c.methodThree();
 * c.methodTwo();
 * c.methodOne();
 * 
 * 3. Hierarchical: single parent and multiple child
 * Parent -> ChildOne and Parent -> ChildTwo 
 * 
 * class A{
 * 		public methodOne(){ }
 * }
 * 
 * 
 * class B extends A{
 * 		public methodTwo(){ }
 * }
 * 
 * class C extends A{
 * 		public methodThree(){ }
 * }
 * 
 * 
 * A a = new A();
 * a.methodOne();
 * 
 * B b = new B();
 * b.methodTwo();
 * b.methodOne();
 * b.methodThree(); error
 * 
 * C c = new C();
 * c.methodThree();
 * c.methodOne();
 * c.methodTwo(); error
 * 
 * 
 * 4. Multiple: multiple parent and single child
 * ParentOne -> Child and ParentTwo -> Child
 * 
 * class A{
 * 		public methodOne(){ }
 * 
 * 		public method() { }
 * }
 * 
 * class B{
 * 		public methodTwo(){ }
 * 		
 * 		public method(){ }
 * }
 * 
 * class C extends A, B // error
 * 
 * 5. Hybrid: combination of hierarchical and multiple
 * Parent -> ChildOne and Parent -> ChildTwo and SubChild -> ChildOne, ChildTwo
 * 
 * 
 */

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
