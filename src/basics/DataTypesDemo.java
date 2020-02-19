package basics;

/*
* In java we have mainly two types of data types
* 1. primitive
* 		boolean either true or false - Boolean
* 		char which will store single character - Character
*		byte store integer values - Byte
*		short store integer values - Short
*		int store integer values -Integer
*		long store integer values - Long
*		float store floating point number -Float
*		double store floating point number - Double
* 	
* 2. reference
* 		Arrays
* 		Strings
* 
*  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
* are known as Wrapper classes. These are used to perform different operations on data.
* 		1. Boolean
* 		2. Character
* 		3. Byte
* 		4. Short
* 		5. Integer
* 		6. Long
* 		7. Float
* 		8. Double
* 
* 	WCData_type obj_name = new WCData_type(value);
* 
* 	Type Casting: converting one type of primitive data to another type of primitive data
* 	up casting: lower memory type to higher memory type : widening : no data loss
* 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
* 
*  Converting primitive data type to wrapper class: boxing
*  Converting wrapper to primitive : un-boxing
* 
* 
* syntax to create primitive data type variable
* data-type var-name  = value; //initialization
* data-type var-name; //declaration
* var-name = value; //assignment to the variable which is already declared
* 
* variable is nothing but name of memory location where we are storing data
*/


public class DataTypesDemo {
	
	public static void main(String[] args) {
		// boolean
		boolean b = true;
		System.out.println("boolean b = "+b);
		
		// character: to store a character we have enclose that single character inside ''
		// in Java characters are unicode and occupies 2 bytes of memory
		char ch = 'a';
		System.out.println("character ch = "+ch);
		System.out.println("min value of character datatype is "+Character.MIN_VALUE);
		System.out.println("max value of character datatype is "+Character.MAX_VALUE);
		System.out.println("size of character in bits is "+Character.SIZE);
		System.out.println("size of character in bytes is "+Character.BYTES);
		System.out.println("************************************************************");
		
		// byte - 1 byte
		byte by = 121;
		System.out.println("byte by = "+by);
		System.out.println("min value of byte datatype is "+Byte.MIN_VALUE);
		System.out.println("max value of byte datatype is "+Byte.MAX_VALUE);
		System.out.println("size of byte in bits is "+Byte.SIZE);
		System.out.println("size of byte in bytes is "+Byte.BYTES);
		System.out.println("************************************************************");
		
		// short - 2 bytes
		short sh = 12345;
		System.out.println("short sh = "+sh);
		System.out.println("min value of short datatype is "+Short.MIN_VALUE);
		System.out.println("max value of short datatype is "+Short.MAX_VALUE);
		System.out.println("size of short in bits is "+Short.SIZE);
		System.out.println("size of short in bytes is "+Short.BYTES);
		System.out.println("************************************************************");
		
		
		// int - 4 bytes
		int i = 123456789;
		System.out.println("int i = "+i);
		System.out.println("min value of int datatype is "+Integer.MIN_VALUE);
		System.out.println("max value of int datatype is "+Integer.MAX_VALUE);
		System.out.println("size of int in bits is "+Integer.SIZE);
		System.out.println("size of int in bytes is "+Integer.BYTES);
		System.out.println("************************************************************");
		
		// long - 8 bytes
		long ln = 12345678901l;
		System.out.println("long ln = "+ln);
		System.out.println("min value of long datatype is "+Long.MIN_VALUE);
		System.out.println("max value of long datatype is "+Long.MAX_VALUE);
		System.out.println("size of long in bits is "+Long.SIZE);
		System.out.println("size of long in bytes is "+Long.BYTES);
		System.out.println("************************************************************");
		
		// float f - 4 bytes
		float f = 3.14f;
		System.out.println("flaot f = "+f);
		System.out.println("min value of float datatype is "+Float.MIN_VALUE);
		System.out.println("max value of float datatype is "+Float.MAX_VALUE);
		System.out.println("size of float in bits is "+Float.SIZE);
		System.out.println("size of float in bytes is "+Float.BYTES);
		System.out.println("************************************************************");
		
		// double - 8 bytes
		double d = 9.8;
		System.out.println("double d = "+d);
		System.out.println("min value of double datatype is "+Double.MIN_VALUE);
		System.out.println("max value of double datatype is "+Double.MAX_VALUE);
		System.out.println("size of double in bits is "+Double.SIZE);
		System.out.println("size of double in bytes is "+Double.BYTES);
		System.out.println("************************************************************");
		
		
		
		// type casting
		
		// up casting: lower - higher
		byte blow = 123;
		short sHigh;
		sHigh = blow;
		System.out.println(sHigh);
		
		// int to float
		int iLow = 786;
		float fHigh = iLow;
		System.out.println(fHigh);
		
		// down casting: higher - lower
		// lower_data_type_var_name = (lower_data_type) higher_data_type_var_name
		int iHigh = 400;
		byte byLow;
		byLow = (byte) iHigh;
		System.out.println(byLow);
		
		// double to long
		double dHigh = 9.8;
		long lLow = (long) dHigh;
		System.out.println(lLow);
		
		// boxing : converting a primitive to reference(wrapper) type
		int ip = 123;
//		Integer iw = new Integer(ip);
//		Integer iw = ip;
		Integer iw = Integer.valueOf(ip);
		System.out.println(iw);
		
		//unboxing : converting a wrapper to primitive type
		Double dw = new Double(89.76);
//		double dp = dw;
		double dp = dw.doubleValue();
		System.out.println(dp);
		
		
		// type conversion: primitive to reference(string)
		// int to string
		int i1 = 123;
		String i1Tos = Integer.toString(i1);
		System.out.println(i1Tos+10);
		
		// float to string
		float f1 = 12.98f;
		String f1Tos = Float.toString(f1);
		System.out.println(f1Tos+10);
		
		// double to string
		double d1 = 8765.98;
//		String d1Tos = Double.toString(d1);
		String d1Tos = d1+"";
		System.out.println(d1Tos+10);
		
		// reference (string) to primitive
		// string to int
		String s1 = "987";
		int s1Toi = Integer.parseInt(s1);
		System.out.println(s1Toi+10);
		
		
		// string float
		String s2 = "9.8";
		float s2Tof = Float.parseFloat(s2);
//		int f2i = (int) s2Tof;
		System.out.println(s2Tof+10);
		
		
		
	}
	
	
	

}
