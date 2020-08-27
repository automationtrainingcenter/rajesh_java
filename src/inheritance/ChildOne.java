package inheritance;

public class ChildOne extends Parent{
	
	public ChildOne() {
		super();
		System.out.println("ChildOne class object created");
	}

	public void methodOne() {
		System.out.println("method one of the child class");
	}
	
	public void methodTwo() {
		System.out.println("method two of child one class");
	}
}
