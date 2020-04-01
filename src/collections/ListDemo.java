package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * collections are inbuilt data structures in java
 * To store collection of values of similar type we can use these Collection Types
 * There are several collection type in Java
 * 1. List: is used to store collection of values of similar type. it allows duplicate values also
 * 2. Set: it is same as list but it does not allow duplicate values
 * 3. Map: it is used to store data as key and value pairs like a dictionary
 * 
 * All these interfaces. We mainly focus on performing CRUD operations using these types
 * C - Create, R - Retrieve, U - Update and D - Delete
 * 
 * List is an interface which is implemented by ArrayList and LinkedList classes
 * ArrayList is same as array but it's size is dynamic
 * LinkedList is like double linked list (current node will store both previous node and next node addresses)
 * 
 * List is index based, and index numbers starts with 0
 * 
 * To add, update and retrieve ArrayList is very fast
 * To insert and delete LinkedList is very fast
 * 
 */

public class ListDemo {
	public static void main(String[] args) {
		// create a list
		List<String> courses = new LinkedList<>();

		// find the number of items in a list by using size()
		System.out.println("number of courses = " + courses.size());

		// verify list is empty or not
		System.out.println("list is empty " + courses.isEmpty());

		// add items to the list
		courses.add("Java");
		courses.add("Python");
		courses.add("selenium");
		courses.add("testing");
		courses.add("flask");
		courses.add("django");
		courses.add("Java");

		// to print the values of a list we can use it's object reference
		System.out.println(courses);

		// retrieve the data from a list using get(index)
		System.out.println("course at index 2 is " + courses.get(2));

		// to retrieve the data of a list we can use either for loop or for each loop
		for (int i = 0; i < courses.size(); i++) {
			System.out.println("course at index " + i + "  ::: " + courses.get(i));
		}

		// retrieve the data from the list using for each loop
		for (String course : courses) {
			System.out.println(course.toUpperCase());
		}

		// retrieve the data from the list using iterator interface
		/*
		 * Iterator interface contains hasNext() and next() hasNext() returns true if
		 * your collection contains next item next() returns next item from the
		 * collection
		 * 
		 */
		// create an Iterator interface object reference by calling the iterator() of
		// the List
		Iterator<String> it = courses.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toLowerCase());
		}

		// insert the data inside the list based on index numbers
		System.out.println("before insert :: " + courses);
		courses.add(4, "RestAssured");
		System.out.println("after insert :: " + courses);

		// update the data at given index of a list using set()
		System.out.println("before update :: " + courses);
		courses.set(5, "pytest");
		System.out.println("after update :: " + courses);

		// search for a data in a list
		System.out.println(courses.contains("selenium"));

		// delete the data from a list either based on index number or item name
		System.out.println("before delete :: " + courses);
//		courses.remove(0);
		courses.remove("Java");
		System.out.println("after delete :: " + courses);

		// remove all the data from the list
		courses.clear();
		System.out.println(courses.isEmpty());
		
		// addAll() will add a list of items to another list
		// removeAll() will remove a list of items from another list

	}

}
