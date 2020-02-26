package basics;
/*
 * Array is a collection of values of similar data type of fixed size. Arrays will store the information in
 * continuous memory locations. We can access array data by index values and this index value starts
 * with 0.
 * 
 * Advantages of arrays over normal variables
 * 1. We can easily store multiple values using single array variable
 * 2. Array data can be accessed easily
 * 3. Sorting and searching of data is easy
 * 
 * There are two types of arrays
 * 1. 1-D arrays
 * 		which will have one row and multiple columns of data
 * 		
 * 		
 * 		//declaration
 * 		data_type[] var_name = new data_type[length];
 * 
 * 		//assigning data
 * 		var_name[index] = value;
 * 
 * 		//retrieve data
 * 		var_name[index];
 * 
 * 		//initialize
 * 		data_type[] var_name = {value0, value1, value2 .... valueN}
 * 		
 * 2. 2-D arrays
 * 		which will store data in multiple rows and multiple columns
 * 		//declaration
 * 		data_type[][] var_name = new data_type[row_length][column_length];
 * 	
 * 		//assign data
 * 		var_name[row_index][column_index] = value;
 * 
 * 		//retrieve data
 * 		var_name[row_index][column_index];
 * 
 * 		//initialize
 * 		data_type[][] var_name = {{r0v1, r0v2, r0v3 ... r0vN},
 * 								  {r1v1, r1v2, r1v3 ... r1vN },
 * 								 
 * 								  {rMv1, rMv2, rMv3 ... rMvN}}
 */

public class ArraysDemo {
	
	public static void main(String[] args) {
		// 1D array declaration
		int[] nums = new int[6];
		
		// find the number of items in an array
		System.out.println(nums.length);
		
		// store values in an array
		nums[2] = 14;
		nums[0] = 12;
		nums[1] = 19;
		
		nums[2]=15;
		nums[3] = 10;
		nums[4] = 13;
		nums[5] = 11;
		
		
		
		// retrieve the data from an array
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println(nums[5]);
//		System.out.println(nums[6]); index number must less than length of array
		
		
		// initialize an array
		char[] vowels = {'a' ,'e', 'i', 'o','u'};
		
		
		// retrieve values from vowels array
		System.out.println(vowels[0]);
		System.out.println(vowels[1]);
		System.out.println(vowels[2]);
		System.out.println(vowels[3]);
		System.out.println(vowels[4]);
		
		// 2D array declaration
		int[][] m1 = new int[2][2];
		
		
		// store some values in m1 array
		m1[0][0] = 8;
		m1[0][1] = 10;
		m1[1][0] = 19;
		m1[1][1] = 11;
		System.out.println(m1.length);
		System.out.println(m1[0].length);
		
		
		
		// retrieve the data from m1 array
		System.out.println(m1[0][0]);
		
		System.out.println(m1[0][1]);
		System.out.println(m1[1][0]);
		System.out.println(m1[1][1]);
 		
		
		
		
	}
	
	

}
