package bankdemo;

public class Savings extends Account {
	private static final double minBalance = 10000;
	private static final double fee = 100;

	public Savings(int id, String name, String address, String phoneNum, double balance, long aadharNum) {
		super(id, name, address, phoneNum, balance, aadharNum);
	}

	public Savings(int id, String name, String address, String phoneNum, double balance, String panNum) {
		super(id, name, address, phoneNum, balance, panNum);
	}

	// overriding Account class withdraw method
	@Override
	public double withdraw(double amount) {
		if (amount >= 0) {
			if (validate()) {
				if (this.balance >= amount) {
					this.balance -= amount;
					System.out.println("withdraw success\nPlease collect your cash");
					// validate balance is greater than minimum balance or not
					if (this.balance < minBalance) {
						this.balance -= fee;
					}
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

}
