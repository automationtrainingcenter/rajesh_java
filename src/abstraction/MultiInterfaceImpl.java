package abstraction;
/*
 * A Java class can implement multiple interfaces but it can not extends multiple classes
 * we can achieve multiple inheritance using interfaces.
 */
public class MultiInterfaceImpl implements InterfaceOne, InterfaceTwo{

	@Override
	public void methodOne() {
		System.out.println("method one of interface one definition in class");
	}

	@Override
	public void methodTwo() {
		System.out.println("method two of interface two definition in class");
	}

	@Override
	public void method() {
		System.out.println("common method definition in class");
	}
	
	
	

}
