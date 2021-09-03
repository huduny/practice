package homeworkNewBank0903;

public class SavingsAccount extends BankAccount{
	private double interestRate;
	
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	public void updateBalance(int period) {
		super.balance += super.balance*this.interestRate*period+super.balance;
	}
}
