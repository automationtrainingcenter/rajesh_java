package accessmodifiers;

public class PrivateDemo {
	
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
//		System.out.println(obj.prVar); // we can't private variables or methods of a class outside of that class
		System.out.println(obj.dVar);
		System.out.println(obj.proVar);
	}

}
