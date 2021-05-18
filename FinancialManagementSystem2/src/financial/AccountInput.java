package financial;

import java.util.Scanner;

import exceptions.AccountNumberFormatException;

public interface AccountInput {
	
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setNumber(String number) throws AccountNumberFormatException;
	
	public void setDeposit(int deposit);
	
	public void setWithdraw(int withdraw);
	
	public void getUserInput(Scanner input);
	
	public void printinfo();

	public void balancecalculate();
	
	public void setAccountID(Scanner input);
	
	public void setAccountName(Scanner input);
	
	public void setAccountNumber(Scanner input);
	
	public void setAccountDeposit(Scanner input);
	
	public void setAccountWithdraw(Scanner input);
	
	public void setCardID(Scanner input);
	
	public void setCardName(Scanner input);
	
	public void setCardNumber(Scanner input);

}
