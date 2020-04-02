package collections;
/*
 * Map is also an inbuilt data structure in Java.
 * 
 * Map is used to store the data in key and value pairs like a dictionary. Here key can be any type
 * (reference or wrapper) and value can be any type (reference or wrapper).
 * 
 * Map is a collection type interface which is implemented by
 * HashMap: it won't maintain any order
 * LinkedHashMap: it will maintain insertion order of the data
 * TreeMap: it will main alphabetical order for character data and ascending order for numeric data
 * based on keys
 * 
 * Map is not index based, it is key based. So we can use keys to retrieve, update or delete the data 
 * from the map
 * 
 * Map can't have duplicate keys but it can have duplicate values.
 */

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		// create a map
		Map<String, Integer> courses = new LinkedHashMap<>();

		// find the number of items in a map by using size()
		System.out.println("number of courses = " + courses.size());

		// verify map is empty or not
		System.out.println("map is empty " + courses.isEmpty());

		// add the data to the map
		courses.put("Java", 45);
		courses.put("Python", 60);
		courses.put("selenium", 60);
		courses.put("testing", 90);
		courses.put("django", 30);
		courses.put("flask", 30);
//		courses.put("Java", 50); // update

		// print the values of a map
		System.out.println(courses);

		// retrieve the data from the map using get(key)
		// get() returns the value of a given key
		System.out.println(courses.get("Python"));

		// retrieve all the keys from the map
		// keySet() returns all the keys of the map as a Set type
		Set<String> keys = courses.keySet();
		for (String key : keys) {
			System.out.println(key + " :: " + courses.get(key));
		}

		// retrieve all the values of the map without keys
		// values() returns all the values of the map as a Collection type
		Collection<Integer> values = courses.values();
//		System.out.println(values);
		for (Integer value : values) {
			System.out.println(value);
		}

		// retrieve all the key and value pairs of the map
		// entrySet() returns all the key and value pairs as a Set of Entry interface
		// objects
		// Entry is an inner interface of Map interface which contains getKey() and
		// getValue() which
		// return key and value pair of a map respectively
		Set<Entry<String, Integer>> pairs = courses.entrySet();
//		System.out.println(pairs);
		for (Entry<String, Integer> pair : pairs) {
			System.out.println(pair.getKey() + " ---- " + pair.getValue());
		}

		// update the data in a map
		// put() can be used to add the new data with new key and also can be used to
		// update the data with existing key
		System.out.println("before update :: " + courses);
		courses.put("django", 40);
		System.out.println("after update :: " + courses);

		// remove the data
		// we can remove data only based on the key or based on both key and value
		System.out.println("before remove :: " + courses);
//		courses.remove("Java"); // based on key only
		courses.remove("Python", 60); // based on both key and value pair
		// if both key and value matches then only above remove method will remove an
		// item from the map
		// else it won't remove item from the map
		System.out.println("after remove :: " + courses);

		// search for data in a map either based on key or value
		System.out.println(courses.containsKey("django"));
		System.out.println(courses.containsValue(80));

		// to remove all the items from a map we can use clear()
		courses.clear();
		System.out.println(courses.size());

		// putAll() is used to add a map of data to another map

	}

}
