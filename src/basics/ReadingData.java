package basics;

import java.util.Scanner;

/* To read data from the console we have to use
 * Scanner class from java.util package
 * 
 * This Scanner class provides several methods to read
 * different types of data from the console
 * 
 * To read 
 * boolean - nextBoolean()
 * byte - nextByte()
 * short-nextShort()
 * int - nextInt()
 * long = nextLong()
 * float - nextFloat()
 * double - nextDouble()
 * single word string - next()
 * multi word string - nextLine()
 * 
 * all the above methods are instance methods so we have to create Scanner class object 
 * to call those methods
 * 
 * syntax to create Scanner class object is
 * Scanner scObj = new Scanner(System.in);
 * 
 * here System.in informs Scanner class to read the data from the default input device
 * i.e. console in IDE
 * 
 * Note:- Scanner class does not have any method to read character data
 * to read Character data we have to read a character as String and then convert that 
 * string to character using charAt(int index) of String class
 * 
 */
public class ReadingData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// read boolean data
		System.out.println("enter a boolean vaue");
		boolean b = sc.nextBoolean();
		System.out.println("boolean b = " + b);

		// read byte data
		System.out.println("enter a byte number");
		byte by = sc.nextByte();
		System.out.println("byte by = " + by);

		// read short data
		System.out.println("enter a short number");
		short sh = sc.nextShort();
		System.out.println("short sh = " + sh);

		// read int data
		System.out.println("enter int number");
		int i = sc.nextInt();
		System.out.println("int i = " + i);

		// read long data
		System.out.println("enter a long number");
		long l = sc.nextLong();
		System.out.println("long l = " + l);

		// read float data
		System.out.println("enter a float number");
		float f = sc.nextFloat();
		System.out.println("float = " + f);

		// read double data
		System.out.println("enter a double numbrer");
		double d = sc.nextDouble();
		System.out.println("double d = " + d);

		// read a string
		System.out.println("enter a string");
		String s = sc.next();
		System.out.println("string s = " + s);

		// read a character
		System.out.println("enter a character");
		String sch = sc.next();
		char ch = sch.charAt(0);

		System.out.println("character ch = " + ch);

	}

}
