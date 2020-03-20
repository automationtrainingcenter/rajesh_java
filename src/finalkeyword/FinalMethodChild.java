package finalkeyword;

public class FinalMethodChild extends FInalMethodParent{

	@Override
	public void methodOne() {
		System.out.println("normal method overriden in child class");
	}
	
//	@Override
//	public void methodTwo() {
//
//	} // we can't override the final methods of the parent class in child class
	
	
}
