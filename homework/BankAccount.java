package homeworkBank0903;

public class BankAccount {
	private int balance;//잔액
	
	public BankAccount(int balance) {//생성자 필드값 초기화
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	public void deposit(int amount) {
		this.balance += amount;
	}
	boolean withdraw(int amount) {
		if (balance>amount) {
			System.out.println("출금이 됩니다.");
			return true;
		}else {
			System.out.println("출금 잔액이 부족 합니다.");
			return false;
		}
	}
	boolean transfer(int amount, BankAccount otherAccount) {
		if (balance>amount) {
			System.out.println("송금이 됩니다.");
			balance -= amount;
			otherAccount.deposit(balance);
			return true;
		}else {
			System.out.println("송금 잔액이 부족 합니다.");
			return false;
		}
	}
}
