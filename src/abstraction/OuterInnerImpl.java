package abstraction;

public class OuterInnerImpl implements Outer, Outer.Inner{

	@Override
	public void iMethod() {
		System.out.println("inner interface method definition in class");
	}

	@Override
	public void oMethod() {
		System.out.println("outer interface method defnition in class");
	}

	@Override
	public Inner method() {
		return this;
	}

}
