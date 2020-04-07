package exceptions;
/*
 * to create our own exceptions we have to create a class which will extends 
 * Exception (Compile time) or RuntimeException (Run time) class.
 */
public class InvalidBrowserException extends Exception{
	
	public InvalidBrowserException(String message) {
		super(message);
	}

}
