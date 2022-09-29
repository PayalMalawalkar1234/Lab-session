package com.piggie;

public class AddAmount {

	private int amount = 50;

	public AddAmount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddAmount(int amount) {
		super();
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "AddAmount [amount=" + amount + "]";
	}

	public void AddAmount1(int a) {
		amount = a + amount;
	}

	public void displayAmount() {
		System.out.println(amount);
	}
}
