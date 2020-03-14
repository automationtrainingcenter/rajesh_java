package encapsulation;

import java.util.Scanner;

/*
 * 	encapsulation means hiding properties of a class from the outside world by making them as private
 *  binding data and the operations on the data together is also encapsulation
 */
public class EncapsulationDemo {
	// Employee
	private int id;
	private String name;
	private String designation;
	private double salary;
	private String address;
	private long phNum;
	private String password;
	private Scanner sc = new Scanner(System.in);

	public EncapsulationDemo(int id, String name, String designation, double salary, String address, long phNum) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
		this.phNum = phNum;
	}

	// getter for id
	public int getId() {
		return this.id;
	}

	// getter for name
	public String getName() {
		return this.name;
	}

	// getter for address
	public String getAddress() {
		return this.address;
	}

	// setter for address
	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (this.designation.equals("hr")) {
			System.out.println("enter your password to update the salary");
			String password = sc.next();
			if (this.password.equals(password)) {
				this.salary = salary;
				System.out.println("salary updated sucessfully");
			} else {
				System.out.println("invalid password");
			}
		} else {
			System.out.println("not authorized to update salary");
		}

	}

	public long getPhNum() {
		return phNum;
	}

	public void setPhNum(long phNum) {
		this.phNum = phNum;
	}

	public void setPassword(String password) {
		if (this.password == null) {
			this.password = password;
		} else {
			System.out.println("enter your phone number");
			long phNum = sc.nextLong();
			if (this.phNum == phNum) {
				this.password = password;
				System.out.println("password updated successfully");
			} else {
				System.out.println("not authourised to change the password");
			}

		}
	}
}
