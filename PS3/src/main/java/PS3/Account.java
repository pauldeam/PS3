package PS3;

import java.util.Date;
import java.io.*;

public class Account {
	
	private static int id;
	private static double balance;
	private static double annualInterestRate;
	private static Date dateCreated;
	
	/**
	 *  Creates a no arg constructor with default values (0's) for the account
	 */
	public void defaultAcount()
	{
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	/**
	 * Creates account with specified values 
	 */
	public static void realAccount(int id, double balance)
	{
		id = id;
		balance = balance;
		
	}

	
	/**
	 * Getter for id
	 * @return id
	 */
	public static int getId() {
		return id;
	}
	
	/**
	 * Setter for id
	 * @return
	 */
	public static void setId(int id) {
		Account.id = id;
	}
	
	/**
	 * Getter for balance
	 * @return balance
	 */
	public static double getBalance() {
		return balance;
	}
	
	/**
	 * Setter for balance
	 * @return
	 */
	public static void setBalance(double balance) {
		Account.balance = balance;
	}
	
	/**
	 * Getter for annual interest rate
	 * @return annualInterestRate
	 */
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	/**
	 * setter for annual interest rate
	 * @return
	 */
	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}
	
	/**
	 * Gets the monthly interest rate
	 * @return monthlyInterestRate
	 */
	public static double monthlyInterestRate()
	{
		return annualInterestRate * (1/12);
	}
	
	/**
	 * Getter for date created
	 * @return dateCreated
	 */
	public static Date getDateCreated() {
		return dateCreated;
	}
	
	/**
	 * withdraw method that throws the exception if too much $$ is draw from the account
	 * @param withdrawAmount
	 * @throws InsufficientFundsException
	 */
	public static void withdraw(double withdrawAmount) throws InsufficientFundsException	
	{
		if(withdrawAmount <= balance)
		{
			balance -= withdrawAmount;
		}
		else
		{
			throw new InsufficientFundsException(withdrawAmount - balance);
		}
	}
	
	/**
	 * Deposits a specified amount in the account
	 * @param depositAmount
	 */
	public static void deposit(double depositAmount)
	{
		balance += depositAmount;
	}

}
