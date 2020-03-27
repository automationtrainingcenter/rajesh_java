package bankdemo;

public interface Account {
	
	public String getAddress();
	
	public void setAddress(String address);
	
	public void setPhoneNum(String phoneNum);
	
	public int getId();
	
	public String getName();
	
	public double getBalance();
	
	public String getPanNum();
	
	public void setPin(int pin);
	
	 public boolean validate();
	
	public double withdraw(double amount);
	
	public void deposit(double amount);
	
	public void display(); 

}
