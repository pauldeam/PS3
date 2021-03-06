package base;

import static org.junit.Assert.*;

import org.junit.Test;
import PS3.Account;
import PS3.InsufficientFundsException;


public class Account_JUnitTest 
{

	@Test
	public void test() throws InsufficientFundsException
	{
		Account.realAccount(1122, 20000.00);
		Account.setAnnualInterestRate(4.5);
		Account.deposit(3000.00);
		try {
			Account.withdraw(2500.00);
		} catch (InsufficientFundsException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("You do not have enough funds in your account to withdraw this amount.");
		}
		System.out.println("ACCOUNT BALANCE: " + Account.getBalance() +
				"\nMONTHLY INTEREST: " + Account.monthlyInterestRate() +
				"\nDATE: " + Account.getDateCreated());
		
		try
		{
			Account.withdraw(4000);
		}
		catch(InsufficientFundsException e)
		{
			System.out.println("You do not have enough funds in your account to withdraw this amount.");
		}
		
	}

}
