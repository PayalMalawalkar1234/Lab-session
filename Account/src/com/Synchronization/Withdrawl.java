package com.Synchronization;

public class Withdrawl extends Runnable {
	Account acc = new Account();

	synchronized public void withdraw() {
		// if balance greater than 500
		if (acc.getBalance() > 1000) {
			// print details
			System.out.println("The withdraw money is " + acc.withdrawAmount(500));
			System.out.println("The account balance is " + acc.getBalance());
		}
	}

	@Override
	public void run() {
		try {
			// thread sleeps for 500 mili sec
			Thread.sleep(500);
			// withdraw
			withdraw();
		}

		catch (Exception e) {

			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		Withdrawl w = new Withdrawl();

		Thread t1 = new Thread("Abc");
		Thread t2 = new Thread("Xyz");

		// t1.run();
		t2.run();
	}

}
