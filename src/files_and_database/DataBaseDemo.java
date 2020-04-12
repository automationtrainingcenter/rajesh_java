package files_and_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To work with database we have gather the following information 
 * 1. DB technology (MSSQL Server, MYSQL, Oracle, DB2 ..etc) 
 * 2. DB Server address 
 * 3. DB credentials
 * 4. Database Name we want to connect to 
 * 5. Table Name on which we want to perform the operations
 * 6. Column Names and their data types
 */

public class DataBaseDemo {

	public static void main(String[] args) {
		/*
		 * Load the driver class related to the DB technology dynamically using
		 * forName() method of Class class
		 */
		String driverClass = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driverClass);
			/*
			 * Create connection to the required database by calling getConnection() method
			 * of DriverManager class and storing reference in Connection class object
			 */
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "password");
			
			// connection url for mysql is
			// ("protocol://sever_ip_address:port/data_base_name", "username", "password")
			/*
			 * Create Statement class object by calling createStatement() method of
			 * Connection class so that we can execute SQL queries
			 */
			Statement stmt = con.createStatement();

			/*
			 * Execute SQL queries using executeQuery() method of Statement class and store
			 * the results in ResultSet class object
			 */
			ResultSet rs = stmt.executeQuery("select * from employees where officeCode=4");

			/* Iterate over the results using next() method of ResultSet class */
			System.out.println("FIRST NAME\tEMAIL");
			while(rs.next()) {
				String firstName = rs.getString("firstName");
				String email = rs.getString("email");
				System.out.println(firstName+"\t"+email);
			}

			/* Close the data base connection using close() method of Connection class */
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
