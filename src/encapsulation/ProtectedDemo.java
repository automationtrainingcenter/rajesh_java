package encapsulation;

import accessmodifiers.AccessModifiersDemo;
/*
 * if both parent and child classes are in same package then
 * Child class object can access public, default and protected variables and methods of the parent class
 * it can't access private properties of the parent class.
 * Parent class object can access all the properties and methods within the Parent class
 * and outside parent class, parent class object can access only public, default and protected
 * 
 * 
 * if Parent class and child class are in two different packages then
 * Child class object can access public and protected variables and methods of the parent class
 * It can't access private and default variables and methods of the parent class
 * Parent class object can access all the properties and methods within the Parent class
 * and outside parent class, parent class object can access only public
 * 
 */

public class ProtectedDemo extends AccessModifiersDemo{
	public static void main(String[] args) {
		// child class object
		ProtectedDemo cobj = new ProtectedDemo();
		System.out.println(cobj.pVar);
//		System.out.println(obj.prVar);
//		System.out.println(obj.dVar);
		System.out.println(cobj.proVar);
		
		
		// Parent class object
		AccessModifiersDemo pobj = new AccessModifiersDemo();
		System.out.println(pobj.pVar);
//		System.out.println(pobj.prVar);
//		System.out.println(pobj.dVar);
//		System.out.println(pobj.proVar);
	}

}
