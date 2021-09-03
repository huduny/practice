package homeworkNewBank0903;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;
	
	public CheckingAccount(int balance) {
		super(balance);
	}
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	
	@Override
	public boolean withdraw(int amount) {
		if (balance >= amount) {
			return true;
		}else if (balance < amount) {
			protectedBy.balance=protectedBy.balance-(amount-balance);
			return true;
		}else
		return false; 
		
	}
	
}
