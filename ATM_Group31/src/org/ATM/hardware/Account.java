package org.ATM.hardware;

public class Account {
	private Bank bank;
	private Integer cardNumber;
	private int PIN;
	private int moneyInAccount;
	private Customer customer;

	public Bank getBank() {
		return this.bank;
	}

	public Integer getCardNumber() {
		return this.cardNumber;
	}

	public int getPIN() {
		return this.PIN;
	}

	public int getMoneyInAccount() {
		return this.moneyInAccount;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setPIN(int PIN) {
		this.PIN = PIN;
	}

	public void setMoneyInAccount(int moneyInAccount) {
		this.moneyInAccount = moneyInAccount;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void withdrawMoneyInAccount(int PIN, int withdrawAmount  ) {
		// TODO should be implemented
	}

	public  Account(int PIN ) {
		// TODO should be implemented
	}

	public void depositMoneyInAccount(int PIN, int deposityAmount  ) {
		// TODO should be implemented
	}

	public void transferToAccount(int PINCurrentAccount, Account transferTo, int PINTransferAccount  ) {
		// TODO should be implemented
	}
}
