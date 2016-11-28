package org.ATM.hardware;

public class ATM {
	private int id;
	private Bank bank;
	private int moneyInATM;

	public int getId() {
		return this.id;
		
		
	}

	public Bank getBank() {
		return this.bank;
	}

	public int getMoneyInATM() {
		return this.moneyInATM;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public void setMoneyInATM(int moneyInATM) {
		this.moneyInATM = moneyInATM;
	}

	public  ATM() {
		// TODO should be implemented
	}

	public void removeBank(Bank bankRemove  ) {
		// TODO should be implemented
	}

	public void withdrawMoney(int amount  ) {
		// TODO should be implemented
	}
}
