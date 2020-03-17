package inheritance;

public class ChildParaCons extends ParentParaCons{

	public ChildParaCons(int id, String name) {
		super(id, name);
		System.out.println("Child class object created");
	}

}
