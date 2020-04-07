package exceptions;

public class BrowserHelper {

	public static void openBrowser(String browserName) throws InvalidBrowserException{
		if (browserName.equals("chrome")) {
			System.out.println("openenig chrome browser");
		} else if (browserName.equals("firefox")) {
			System.out.println("opening firefox browser");
		} else {
			throw new InvalidBrowserException("brwoser name must be either chrome or firefox");
		}
	}

	public static void main(String[] args) {
		try {
			openBrowser("chrome");
		} catch (InvalidBrowserException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("database connections");
	}

}
