package com.Synchronization;

public class Account {

	private int balance = 10000;

	public int getBalance() {
		return this.balance;
	}

	public int withdrawAmount(int withdrawAmt) {
		this.balance = this.balance - withdrawAmt;
		return withdrawAmt;

	}

}
