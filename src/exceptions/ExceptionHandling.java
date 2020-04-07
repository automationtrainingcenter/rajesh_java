package exceptions;
/*
 * Exception means interruption to the normal flow of execution
 * 
 * There are two types of exceptions in Java
 * 1. compile time exception (catched exceptions):
 * 		These are the exceptions which will occur at the compile i.e conversion .java file .class 
 * Note: In general we will compile a java file using javac command then that command will create .class file
 * if there is no compile time errors or exceptions in our java file.
 * 
 * 2. runtime exception (uncatched exceptions):
 * 		These are the exceptions which will occur at runtime i.e. while running or executing .class file.
 * Note: In general we will run .class file using java command.
 * 
 * 
 * we can handle exceptions using try and catch block
 * 
 * try: it is a block which contains statements which will throw or rise an exception.
 * 
 * catch: it is a block which will catch the exception thrown by try block and contains the
 * statement which has to execute at the time of exception.
 * 
 * Note: try block always followed by catch block, i.e. without writing a catch block we can not write
 * try block and vice versa.
 * 
 * Note: a try block can have any number of catch blocks (at least one) which will handle
 * different type of exceptions.
 * 
 * finally: it is a block which contains statements which has to execute irrespective of the exception.
 * 
 * throws keyboard: it is used to postpone the handling of compile time exception to the method call
 * we have to write this throws keyword to the method declaration which contains statement throwing an exception
 * 
 * throw keyword: it is used to raise a new exception.
 * 
 * All the exceptions are child classes of Exception class and Exception class is the implementation class of
 * Throwable interface.
 * so we can handle any type of exception by giving object reference to Exception class or Throwable interface.
 * 
 */

public class ExceptionHandling {

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 9, 7, 10, 11 };
		String name = "sunshine";
		// run time exception
		try {
			System.out.println(numbers[3]);
			System.out.println(numbers[0] / 1);
			System.out.println(name.charAt(numbers[1]));
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("array index number must be lessthan or equal to " + numbers.length);
//		} catch (ArithmeticException e) {
//			System.out.println("division 0 is not posible. Denominator must not be 0");
		} catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally block always executes");
		}

		// compile time exception
		

		System.out.println(numbers.length);
	}

}
