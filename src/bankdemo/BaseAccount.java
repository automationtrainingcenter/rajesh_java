package bankdemo;

import java.util.Scanner;

public class BaseAccount implements Account {

	// properties of account
	private int id;
	private String name;
	private String address;
	private String phoneNum;
	protected double balance;
	private String panNum;
	private long aadharNum;
	private int pin;
	private Scanner sc = new Scanner(System.in);

	// parameterised constructor
	private BaseAccount(int id, String name, String address, String phoneNum, double balance) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.balance = balance;
	}

	public BaseAccount(int id, String name, String address, String phoneNum, double balance, String panNum) {
		this(id, name, address, phoneNum, balance);
		this.panNum = panNum;
	}

	public BaseAccount(int id, String name, String address, String phoneNum, double balance, long aadharNum) {
		this(id, name, address, phoneNum, balance);
		this.aadharNum = aadharNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validate()) {
			this.address = address;
		}
	}

	public void setPhoneNum(String phoneNum) {
		if (validate()) {
			this.phoneNum = phoneNum;
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public String getPanNum() {
		return panNum;
	}

	public long getAadharNum() {
		return aadharNum;
	}

	public void setPin(int pin) {
		if (this.pin == 0) {
			this.pin = pin;
		} else {
			System.out.println("To Update the pin please enter your phone number");
			String phoneNum = sc.next();
			if (this.phoneNum.equals(phoneNum)) {
				this.pin = pin;
				System.out.println("pin updated successfully");
			} else {
				System.out.println("unauthorized access to update the pin");
			}
		}
	}

	// validate
	protected boolean validate() {
		System.out.println("enter your pin");
		int pin = sc.nextInt();
		if (this.pin == pin) {
			return true;
		} else {
			System.out.println("incorrect pin");
			return false;
		}
	}

	// withdraw
	public double withdraw(double amount) {
		if (amount >= 0) {
			if (validate()) {
				if (this.balance >= amount) {
					this.balance -= amount;
					System.out.println("withdraw success\nPlease collect your cash");
					return amount;
				} else {
					System.out.println("insufficient balance");
				}
			}
		} else {
			System.out.println("invalid amount");
		}
		return 0;
	}

	// deposit
	public void deposit(double amount) {
		if (amount >= 0) {
			if (validate()) {
				this.balance += amount;
				System.out.println("deposite success");
			}
		} else {
			System.out.println("invalid amount");
		}
	}

	// display
	public void display() {
		System.out.println("account number : " + this.id + "\nname : " + this.name + "\naddress : " + this.address
				+ "\nbalance : " + this.balance);
	}
}
