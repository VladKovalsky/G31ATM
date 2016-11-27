package org.ATM.hardware;

public class Customer {
	private String name;
	private int userPassword;
	private Account accounts;
	private Bank banks;
	private Integer cardNumbers;

	public String getName() {
		return this.name;
	}

	public int getUserPassword() {
		return this.userPassword;
	}

	public Account getAccounts() {
		return this.accounts;
	}

	public Bank getBanks() {
		return this.banks;
	}

	public Integer getCardNumbers() {
		return this.cardNumbers;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUserPassword(int userPassword) {
		this.userPassword = userPassword;
	}

	public void setAccounts(Account accounts) {
		this.accounts = accounts;
	}

	public void setBanks(Bank banks) {
		this.banks = banks;
	}

	public void setCardNumbers(Integer cardNumbers) {
		this.cardNumbers = cardNumbers;
	}

	public void Customer(int newPassword  ) {
		// TODO should be implemented
	}

	public void closeAccount(Account accountToClose, int Password  ) {
		// TODO should be implemented
	}

	public void removeBank(Bank bankToClose  ) {
		// TODO should be implemented
	}

	private void removeCard(Integer removeCardNumber  ) {
		// TODO should be implemented
	}
}
