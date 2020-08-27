package collections;
/*
 * Set is an inbuilt data structure in Java.
 * Set is an interface which is implemented by 
 * HashSet: it won't maintain any order for your data
 * LinkedHashSet: it will maintain insertion order for the data
 * TreeSet: it will maintain alphabetical order for character data and ascending order for numeric data
 * 
 * Set is not index based. So to retrieve the data we have to use either
 * for each loop or iterator interface.
 * 
 * Set does not store duplicate values
 * 
 */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// create a set
		Set<String> courses = new TreeSet<>();

		// find the number of items in a set by using size()
		System.out.println("number of courses = " + courses.size());

		// verify set is empty or not
		System.out.println("set is empty " + courses.isEmpty());

		// add items to the set
		courses.add("Java");
		courses.add("Python");
		courses.add("selenium");
		courses.add("testing");
		courses.add("flask");
		courses.add("django");
		courses.add("Java");
		courses.add("php");

		// print all the values of the set on the console
		System.out.println(courses);

		// retrieve the data from the set using for each loop
		for (String course : courses) {
			System.out.println(course.toUpperCase());
		}
		
		// retrieve the data from the set using iterator interface
		/*
		 * Iterator interface contains hasNext() and next() hasNext() returns true if
		 * your collection contains next item next() returns next item from the
		 * collection
		 * 
		 */
		// create an Iterator interface object reference by calling the iterator() of
		// the Set
		Iterator<String> it = courses.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toLowerCase());
		}

		// In set insertion is not possible because set is not index based and set does
		// not maintain any order for the data

		// In set to update the data remove the old data and add the new data

		// remove the data from the set
		System.out.println("before remove :: " + courses);
		courses.remove("php");
		System.out.println("after remove :: " + courses);

		// search for the data in a set
		System.out.println(courses.contains("flask"));

		// to remove all the items from the set we can use clear()
		courses.clear();
		System.out.println(courses);

		// addAll() will add a set of items to another set
		// removeAll() will remove a set of items from another set

	}

}
