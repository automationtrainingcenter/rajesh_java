package bankdemo;

public class Credit extends BaseAccount {
	private double creditLimit;
	private double cashLimit;
	private static final double fee = 300;

	private void setCashLimit() {
		this.creditLimit = this.balance;
		this.cashLimit = this.creditLimit * 0.3;
	}

	public Credit(int id, String name, String address, String phoneNum, double balance, long aadharNum) {
		super(id, name, address, phoneNum, balance, aadharNum);
		// here balance means credit limit
		setCashLimit();
	}

	public Credit(int id, String name, String address, String phoneNum, double balance, String panNum) {
		super(id, name, address, phoneNum, balance, panNum);
		setCashLimit();
	}

	// in credit cards we can withdraw money from cash limit not from credit limit
	@Override
	public double withdraw(double amount) {
		if (amount >= 0) {
			if (validate()) {
				if (this.cashLimit >= amount) {
					this.creditLimit -= amount + fee;
					this.cashLimit -= amount + fee;
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

	// deposit are like repayments
	@Override
	public void deposit(double amount) {
		double dueAmount = this.balance - this.creditLimit;
		if (amount >= 0) {
			if (amount <= dueAmount) {
				this.creditLimit += amount;
				this.cashLimit = this.creditLimit * 0.3;
			} else {
				System.out
						.println("Payment not processed.\nrepayment amount must be lessthan or equal to " + dueAmount);
			}
		} else {
			System.out.println("invalid amount");
		}
	}
	
	@Override
	public double getBalance() {
		return this.creditLimit;
	}
	
	public void displayCashLimit() {
		System.out.println("cash limit in your account is "+this.cashLimit);
	}

}
