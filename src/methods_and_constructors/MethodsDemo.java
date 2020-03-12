package methods_and_constructors;

import java.lang.reflect.Method;

/*
 * Methods:
 * Method is a collection of statement or group of statements which are combined together
 * to perform specific task.
 * 
 * The purpose of the methods are code reusability
 * 
 * every method mainly contains 3 parts
 * 1. method declaration or method head
 * 2. method definition or method body
 * 3. method call
 * 
 * syntax to create a method
 * access_modifier static (optional)  return_type method_name(arg1, arg2 ... argN){
 * 		statements; (method body)
 * }
 * 
 * syntax to call a method
 * return_type_data_type var_name = method_name(para1, para2, .... paraN);
 * 
 * 
 * Here arguments in method declaration are variables to accept input and return_type is 
 * the output from the method. If method have any output then we have to add
 * return statement to the method body. If method does not have any output then 
 * return type in method declaration is void.
 * 
 * parameters in method call are input to the method and var_name holds the output of the method
 * 
 * 
 * Based on input and output we can divide methods into 4 types
 * 1. method without input and without output
 * 2. method without input and with output
 * 3. method with input and without output
 * 4. method with input and with output
 * 
 * 
 */
public class MethodsDemo {
	
	
	// method without input and without output
	public void methodOne() {
		System.out.println("method without input and without output");
	}

	
	// method without input and with output
	public boolean methodTwo() {
		System.out.println("method without input and with output");
		System.out.println("this method returns a boolean output");
		return false;
	}
	
	
	// method with input and without output
	public void methodThree(int i) {
		System.out.println("method with input and without output");
		System.out.println("this method accepts an integer input i = "+i);
	}
	
	// method with input and with output
	public int methodFour(int a, int b) {
		System.out.println("method with input and with output");
		System.out.println("this method accepts two inputs a = "+a+" b = "+b);
		System.out.println("this method return sum of a and b");
		return a+b;
	}
	
	public static void main(String[] args) {
		// all the method in this class are instance methods, so call them by creating an object
		// with in main method
		MethodsDemo obj = new MethodsDemo();
//		obj.methodOne();
//		boolean r1 = obj.methodTwo();
//		System.out.println(r1);
//		obj.methodThree(10);
		int r2 = obj.methodFour(10, 20);
		System.out.println(r2);
	}
}
