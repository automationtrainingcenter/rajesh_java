package abstraction;

public interface Outer {
	
	void oMethod();
	
	Inner method();
	
	interface Inner{
		
		void iMethod();
	}

}
