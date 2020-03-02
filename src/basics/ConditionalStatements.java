package basics;

import java.util.Scanner;

/*
 * Conditional statements are the statements which contains conditional operators and combination
 * of conditional and logical operators
 * 
 * These are used to execute a block of statements based on some condition or expression
 * ******** if ************
 * if(expression){
 * 		statements
 * }
 * if the expression true then the statements inside if block will be executed.
 * 
 * 
 * ************ if-else ************
 * if(expression){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if the expression is true the statements inside if block will be executed else statements 
 * inside else block will be executed
 * 
 * 
 * ************ else if ladder ************
 * if(expression 1){
 * 		statements;
 * }else if(expression 2){
 * 		statements;
 * }else if(expression 3){
 * 		statements;
 * }
 * .
 * .
 * .
 * }else if(expression n){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if expression 1 is true it will execute statements inside if block else if will expression 2 and 
 * if expression 2 is true it will execute statements inside expression 2 else if block else if will
 * verify next expression. if all the expressions are false then it will execute statements inside
 * else block
 * 
 * 
 * ************ nested if ************
 * if(expression 1){
 * 		if(expression 2{
 * 			statements;
 * 		}else{
 * 			statements;
 * 		}
 * }else{
 * 		statements;
 * }
 * 
 * 
 * ************ switch case: it will work based on value ************
 * switch(Value){
 * 		case value1;
 * 			statements;
 * 			break;
 * 		case value2:
 * 			statements;
 * 			break;
 * 		.
 * 		.
 * 		.
 * 		case valueN:
 * 			statements;
 * 			break;
 * 		default:
 * 			statements;
 * }
 * 	
 * 
 */
public class ConditionalStatements {

	public static void main(String[] args) {
		// simple if
		// verify a given number is positive
		int num = -15;

		if (num >= 0) {
			System.out.println("given number is positive");
		}

		System.out.println("statements after the simple if block");

		// if else
		// verify a given number is odd or even
		if (num % 2 == 0) {
			System.out.println("given number is even");
		} else {
			System.out.println("given number is odd");
		}

		// else if ladder
		// verify biggest number in given 2 numbers
		int a = 20;
		int b = 200;

		// create a Scanner class object to read the data
		Scanner sc = new Scanner(System.in);
//		int a, b;
//		System.out.println("enter first number a = ");
//		a = sc.nextInt();
//		System.out.println("enter second number b = ");
//		b = sc.nextInt();
		System.out.println("*****************Else If Ladder***********************");
		if (a > b) {
			System.out.println("a is bigger");
		} else if (b > a) {
			System.out.println("b is bigger");
		} else {
			System.out.println("both are equal");
		}

		// nested if
		// verify biggest number in given 2 numbers
		System.out.println("*****************Nested If***********************");
		if (a != b) {
			if (a > b) {
				System.out.println("a is Greaterthan b");
			} else {
				System.out.println("b is Greaterthan a");
			}
		} else {
			System.out.println("a and b both are equal");
		}

		// switch case
		// launch browser based on browser name
		String browserName = "chrome";
		switch (browserName) {
		case "chrome":
			System.out.println("launching chrome browser");
			System.out.println("navigating to google page");
			break;
		case "firefox":
			System.out.println("launching firefox browser");
			System.out.println("navigating facebook page");
			break;
		case "edge":
			System.out.println("launching edge browser");
			System.out.println("navigating to gmail.com");
			break;
		default:
			System.out.println("launching ie browser");
			System.out.println("navigating msn page");
		}

		// facebook scenario
		System.out.println("FACEBOOK LOGIN ::");
		/*
		 * System.out.println("enter username"); String username = sc.next(); //
		 * sunshine System.out.println("enter password"); String password = sc.next();
		 * // selenium if (username.equals("sunshine") && password.equals("selenium")) {
		 * System.out.println("Welcome " + username); } else {
		 * System.out.println("invalid credentials"); }
		 */

		// gmail scenario
		System.out.println("GAMIL LOGIN :: ");
		/*
		 * System.out.println("enter username"); String uname = sc.next(); if
		 * (uname.equals("sunshine")) { System.out.println("enter password"); String
		 * pass = sc.next(); if (pass.equals("selenium")) {
		 * System.out.println("You have 10 Unread mails"); } else {
		 * System.out.println("invalid password"); } } else {
		 * System.out.println("invalid username"); }
		 */

		/*
		 * grading scenario if grade is greater than 50 then bronze if grade is greater
		 * than 60 then silver if grade is greater than 70 then gold if grade is greater
		 * than 80 then diamond if grade is less than or equal to 50 then fail if grade
		 * is greater than 100 then invalid marks
		 */
		int marks = 98;
		if (marks > 0 && marks <= 50) {
			System.out.println("GRADE :: FAIL");
		} else if (marks > 50 && marks <= 60) {
			System.out.println("GRADE :: BRONZE");
		} else if (marks > 60 && marks <= 70) {
			System.out.println("GRADE :: SILVER");
		} else if (marks > 70 && marks <= 80) {
			System.out.println("GRADE :: GOLD");
		} else if (marks > 80 && marks <= 100) {
			System.out.println("GRADE :: DIAMOND");
		} else if (marks > 100) {
			System.out.println("invalid marks");
		}

		// verify a string contains vowels or not
		String str = "lazer";
		str = str.toLowerCase();
		if (str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u")) {
			System.out.println("string contains vowels");
			// print which vowel comes first in given string
			if (str.contains("a")) {
				System.out.println("string contains a");
			} else if (str.contains("e")) {
				System.out.println("string contains e");
			} else if (str.contains("i")) {
				System.out.println("string contains i");
			} else if (str.contains("o")) {
				System.out.println("string contains o");
			} else {
				System.out.println("string contains u");
			}
		} else {
			System.out.println("string does not contains vowels");
		}

	}

}
