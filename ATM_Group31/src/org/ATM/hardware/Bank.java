package org.ATM.hardware;

public class Bank {
	private String name;
	private Customer customerList;
	private Account accountList;

	public String getName() {
		return this.name;
	}

	public Customer getCustomerList() {
		return this.customerList;
	}

	public Account getAccountList() {
		return this.accountList;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCustomerList(Customer customerList) {
		this.customerList = customerList;
	}

	public void setAccountList(Account accountList) {
		this.accountList = accountList;
	}

	public  Bank(String name ) {
		// TODO should be implemented
	}
}
