package encapsulation;

import accessmodifiers.AccessModifiersDemo;

public class DefaultDemo {
	
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
//		System.out.println(obj.prVar);
//		System.out.println(obj.dVar);
//		System.out.println(obj.proVar); // we can't access default and protected outside the package they declared
	}

}
