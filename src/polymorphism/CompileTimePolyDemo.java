package polymorphism;

public class CompileTimePolyDemo {

	public void add(String a, int b) {
		System.out.println(a + b);
	}

	// change in type of input
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	// change in sequence of input
	public void add(int a, String b) {
		System.out.println(a + b);
	}

	// change in number of inputs
	public void add(String a, int b, int c) {
		System.out.println(a + b + c);
	}

	// change in return type of mehtod
//	public String add(String a, int b) {
//		
//	}
	// Note: By changing only return type of a method we can't achieve method
	// overloading or compile time polymorphism

}
