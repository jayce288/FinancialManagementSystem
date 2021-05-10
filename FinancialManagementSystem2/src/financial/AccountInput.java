package financial;

import java.util.Scanner;

public interface AccountInput {
	
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setNumber(String number);
	
	public void setDeposit(int deposit);
	
	public void setWithdraw(int withdraw);
	
	public void getUserInput(Scanner input);
	
	public void printinfo();

	public void balancecalculate();

}
