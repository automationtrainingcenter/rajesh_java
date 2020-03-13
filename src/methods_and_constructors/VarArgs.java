package methods_and_constructors;

public class VarArgs {
	/*
	 * passing variable number of arguments to a java method
	 * access_modifier return_type method_name(data_type... var_name){
	 * 		statements;
	 * }
	 * 
	 * the above method accepts either 0 or more number of parameters
	 */

	public void method(int... args) {
		System.out.println("method accepts " + args.length + " arguments");
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
		for(int arg : args) {
			System.out.println(arg);
		}
	}

	public static void main(String[] args) {
		VarArgs obj = new VarArgs();
		obj.method();
		obj.method(12);
		obj.method(12, 13, 14);
		obj.method(12, 13, 10, 11, 15, 19, 14, 18, 16);
	}

}
