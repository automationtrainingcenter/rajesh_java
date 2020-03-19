package polymorphism;

public class RuntimePolyChild extends RunTimePolyParent {

	@Override
	public void add(String a, int b) {
		System.out.println("child class add method");
		if (a.matches("^\\d+$")) {
			int ia = Integer.parseInt(a);
			System.out.println(ia + b);
		}else {
//			super.add(a, b);
			System.out.println(a+b);
		}

	}

}
