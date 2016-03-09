package PS3;

import java.util.Date;

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
	 * @param id
	 * @param balance
	 */
	public Account(int id, double balance)
	{
		id = id;
		balance = balance;
		
	}

	
	/**
	 * 
	 * @return
	 */
	public static int getId() {
		return id;
	}
	/**
	 * 
	 * @return
	 */
	public static void setId(int id) {
		Account.id = id;
	}
	/**
	 * 
	 * @return
	 */
	public static double getBalance() {
		return balance;
	}
	/**
	 * 
	 * @return
	 */
	public static void setBalance(double balance) {
		Account.balance = balance;
	}
	/**
	 * 
	 * @return
	 */
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	/**
	 * 
	 * @return
	 */
	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}
	/**
	 * 
	 * @return
	 */
	public static Date getDateCreated() {
		return dateCreated;
	}

}
