package basics;

import java.util.Scanner;

/*
 * Loops are used to execute a block of statements repeatedly based on some
 * condition. Each and every repetition is known as an iteration.
 * 
 * Java contains mainly 4 loops
 * 1. while 
 * 2. do while
 * 3. for
 * 4. for each
 * here for each loop is used to iterate over a collection of data like 
 * arrays, It is not condition based loop
 * 
 * every loop (except for each) contains mainly 3 parts
 * 1. initialization
 * 2. condition or expression
 * 3. increment or decrement
 * 
 *while loop:
 *
 *initialize;
 *
 *while(condition or expression){
 *	statements which we want to repeat;
 *	increment or decrement
 *}
 *
 *the minimum number of iterations in while loop is 0
 *
 *do while loop:
 *
 *initialize;
 *
 *do{
 *	statements we want to repeat
 *	increment or decrement
 *}
 *while(condition or expression);
 *the minimum number of iterations in do while loop is 1
 *
 *
 *for loop:
 *
 *for(initialization; condition or expression; increment or decrement){
 *	statements we want to repeat;
 *}
 *the minimum number of iterations in for loop is 0
 *
 *for each loop:
 *
 *for(collection_data_type var_name : collection_varaible_name){
 *	statements to repeat;
 *}
 *
 *the minimum number of iterations in for each loop is 0
 *
 *to stop infinite loop we use press ctrl + c in command prompt
 *or we can click stop button in eclipse console
 *
 *
 *break -- it is a statement which is used to terminate loop block
 *continue -- it is a statement which will skip the current iteration and continues next iterations
 */

public class LoopsDemo {

	public static void main(String[] args) {
		// print numbers from 1 to 10
		// while loop
		int i = 1; // initialization
		while (i < 11) /* condition */ {
			System.out.println(i); // statement to repeat
			i++; // increment
		}

		// print numbers from 20 to 10 (excluded)
		// do - while
		int j = 20;
		do {
			System.out.println(j);
			j--;
		} while (j > 10);

		// print even numbers from 0 to 20
		// for loop
		for (int k = 0; k <= 20; k++) {
			if (k % 2 == 0) {
				System.out.println(k);
			}
		}

		// retrieve data from a string array
		// for each loop
		String[] courses = { "c", "cpp", "java", "python", "selenium", "rest assured", "flask", "django" };
		for (String course : courses) {
			// convert the string to upper case
//			course = course.toUpperCase();
			// print the course on the console
			System.out.println(course.toUpperCase());
		}

		// reverse the given string
		// selenium :: muineles
		String str = "sunshine";
		String rstr = "";

//		for (int k = 1; k <= str.length(); k++) {
//			rstr = rstr + str.charAt(str.length() - k);
//		}

		for (int k = str.length() - 1; k > -1; k--) {
			rstr = rstr + str.charAt(k);
//			System.out.println("rstr === " +rstr);
		}

		System.out.println(rstr);

		// reverse of the given number
		// palindrome number 121
		int num = 16721;
		int rn = 0;
		int temp = num;
		while (temp > 0) {
			int r = temp % 10;
			temp = temp / 10;
			rn = rn * 10;
			rn = rn + r;
//			System.out.println(rn);
		}

//		System.out.println("after loop rn = " + rn);
		if (rn == num) {
			System.out.println("given number is palindrome");
		} else {
			System.out.println("given number is not palindrome");
		}

		// remove duplicates from a String
		str = "sunshine institute";
		String nodupes = "";
//		for(int s = 0; s < str.length(); s++) {
//			char ch = str.charAt(s);
//			if(nodupes.indexOf(ch) == -1) {
//				nodupes += ch;
//			}
//		}

		for (int s = 0; s < str.length(); s++) {
			String ch = str.substring(s, s + 1);
			if (!nodupes.contains(ch)) {
				nodupes = nodupes.concat(ch);
			}
		}
		System.out.println(nodupes);

		// break and continue
		for (int l = 0; l < 10; l++) {
			if (l == 5) {
//				break;
				continue;
			}
			System.out.println(l);
		}

		System.out.println("$$$$$$$$$ After for $$$$$$$$$$$$$");

		// print even numbers from 0 to 10 (excluded)
		for (int l = 0; l < 10; l++) {
			if (l % 2 == 1) {
				continue;
			}
			System.out.println(l);
		}

		// verify a given number is prime number or not
		int p = 25;
		boolean status = true;
		for (int l = 2; l <= p / 2; l++) {
			if (p % l == 0) {
				System.out.println("number is not prime and is divsible by " + l);
				status = false;
				break;
			}
		}
		if (status) {
			System.out.println("number is prime");
		}

		// read a number until we enter a prime number
		Scanner sc = new Scanner(System.in);
		int number;
		boolean flag;
		do {
			flag = false;
			System.out.println("enter a number");
			number = sc.nextInt();
			System.out.println("number ::: " + number);
			// verify number is prime or not
			for (int l = 2; l <= number / 2; l++) {
				if (number % l == 0) {
					flag = true;
					break; // it breaks for loop
				}
			}
		} while (flag);

		// reverse every string of a string array
		for (int c = 0; c < courses.length; c++) {
			// reverse every string
			String rcourse = "";
			for (int k = courses[c].length() - 1; k >= 0; k--) {
				rcourse += courses[c].charAt(k);
			}
			System.out.println(rcourse);
		}

	}

}
