package homeworkBank0903;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount account;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return "고객의 이름: " + firstName + lastName + " 계좌의 잔액은 "+ 
				account.getBalance();
	}

}// class end