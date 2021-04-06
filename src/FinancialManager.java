import java.util.Scanner;

public class FinancialManager {
	Financial financial;
	Scanner input;
	FinancialManager(Scanner input) {
		this.input = input;
	}
	public void DeposittoAccount() {
		financial = new Financial();
		System.out.print("Deposit:");
		financial.Deposit = input.nextInt();
		System.out.println("Today Deposit: " + financial.Deposit);
	}
	
	public void WithdrawtoAccount() {
		System.out.print("Withdraw:");
		financial.Withdraw = input.nextInt();
		System.out.println("Today Withdraw: " + financial.Withdraw);
	}
	
	public void AccountManagemnet() {
		System.out.println("Today Deposit: " + financial.Deposit);
		System.out.println("Today Withdraw: " + financial.Withdraw);
		financial.Balance = financial.Balance + financial.Deposit - financial.Withdraw;
		System.out.println("Current Balance: " + financial.Balance);
	}

}
