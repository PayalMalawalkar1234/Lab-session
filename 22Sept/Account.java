/*
Write a  java program to create a BankAccount and display the people with balance less than 1000.
@Author Payal Malawalkar
Date 23 Sept 2022

*/

import java.util.Scanner;
class Account
{
	private int accountNumber;
	private String name;
	private String password;
	private double balance;
	
	// no argument constructor
	void Account()
    {
		
		
	
	}	
	
	//parameterized constructor
	
	 void Account(int accountNumber, String name, String password,double balance)
	{
		this.accountNumber=accountNumber;
		this.name=name;
		this.password=password;
		
		this.balance= 1000.00;
		
		
	}
	
	
	void deposit(double amt)
	{
		this.balance+=amt;
		System.out.println("The balance for :"+this.accountNumber+ "has been credited by :Rs"+ amt);
		System.out.println("Total balance is :Rs"+this.balance);
		
	}
	
	
	void printAccountDetails()
	{
		System.out.println("Account Number :"+this.accountNumber);
		System.out.println("Account Holder Name :"+this.name);
		
		System.out.println("Account Balance :"+this.balance);
	
		
	}
	
}




	
	

 class Bank
{
	    // calling main method
	     public static void main(String...args)
		 {
		// Creating an array of accounts
		Account bank1[]=new Account[10];
		
		// Constructor injection
		bank1[0]=new Account(1,"Jack",10000);
		bank1[1]=new Account(2,"Ram",60000);
		bank1[2]=new Account(3,"John",100);
		bank1[3]=new Account(4,"Shyam",500);
		bank1[4]=new Account(5,"Tom",30000);
		bank1[5]=new Account(6,"Nick",70900);
		bank1[6]=new Account(7,"Sunny",800);
		bank1[7]=new Account(8,"Com",4000);
		bank1[8]=new Account(9,"Hana",1000);
		bank1[9]=new Account(10,"Sana",160000);
		
		// running the loop on bank1 array
		for(int i=0;i<bank1.length;i++) 
		{
			// storing the amount in variable
			double amount=bank1[i].getAccBalance();
			// if amount is less than 1000
			if(amount<1000)
			{
				// print account details
				System.out.println("\n------- Account "+i+" Detsils -------");
				System.out.println("The account id is : "+bank1[i].getAccId());
				System.out.println("The account holder name is : "+bank1[i].getAccHolderName());
				System.out.println("The account balance is : "+bank1[i].getAccBalance());
			} // if ends 
			
		} // for loop ends
		
	} //main method ends 
		
		
		
	}

	
