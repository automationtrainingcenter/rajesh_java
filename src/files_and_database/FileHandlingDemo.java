package files_and_database;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * Property files
 * 
 * these are nothing normal text files which are saved using .properties
 * these files are used to store data in key and value pairs.
 * 
 * These are used to store configuration related data
 * 
 */
public class FileHandlingDemo {
	
	public static void main(String[] args) {
		// create an object of FileInputStream to read the data from a file
		try {
			FileInputStream fis = new FileInputStream(".//resources//config.properties");
			// to read the data from the properties file, create an object of Properties class
			Properties prop = new Properties();
			prop.load(fis);
			// getter methods to retrieve the data from the properties file
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password", "qwerty");
			String email = prop.getProperty("email", "surya@sunshine.com");
			System.out.println("url "+ url+"\tusername "+username+"\tpassword "+password);
			System.out.println("email "+email);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}

}
