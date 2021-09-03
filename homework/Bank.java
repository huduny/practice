package homeworkBank0903;

public class Bank {
	//field
	private Customer[] customers;
	private	int numberOfCustomers;
	
	//constructor
	Bank(){
		this.customers = new Customer[10];
	}
	
	//method
	public void addCustomer(Customer customer) {
		this.customers[numberOfCustomers]=customer;
		numberOfCustomers ++;
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	public Customer[] getCustomers() {
		return customers;
	}
	public Customer getCustomer(int index) {
		return this.customers[index];
	}


} // class end