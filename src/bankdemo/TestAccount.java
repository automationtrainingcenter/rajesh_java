package bankdemo;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		Account account = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("select your account type\n1. Savings\n2. Current\n3. Credit");
		int accType = sc.nextInt();
		if (accType == 1) {
			account = new Savings(101, "rajesh", "miyapur", "9876543120", 50000.00, 987654123456l);	
		} else if (accType == 2) {
			account = new Current(101, "rajesh", "miyapur", "9876543120", 50000.00, 987654123456l);
		} else if (accType == 3) {
			account = new Credit(101, "rajesh", "miyapur", "9876543120", 50000.00, 987654123456l);
		}

		account.display();
		// set the pin
		account.setPin(1234);
		account.withdraw(10000);
		System.out.println("balance in account is " + account.getBalance());
		account.deposit(15000);
		System.out.println("balance in account is " + account.getBalance());
		account.withdraw(4000);
		System.out.println("balance in account is " + account.getBalance());

		// display cash limit
		if (account instanceof Credit) {
//			Credit caccount = (Credit) account;
			((Credit) account).displayCashLimit();
		}

	}

}
