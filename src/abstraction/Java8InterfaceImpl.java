package abstraction;

public class Java8InterfaceImpl implements Java8Interface{

	@Override
	public void methodOne() {
		System.out.println("method one implementation in class");
	}
	
	@Override
	public void methodThree() {
		System.out.println("default method three overriden in implementaion class");
	}	

}
