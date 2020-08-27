

package abstraction;

@FunctionalInterface // introduced in 1.8
public interface FuncInterface {
	
	void methodOne();
	
	// the purpose @FunctionalInterface annotation is to make sure that interface
	// contains one and only one abstract method
}
