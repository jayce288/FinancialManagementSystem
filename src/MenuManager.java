import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FinancialManager financialManager = new FinancialManager(input);
		
		int num = 0;
		while (num != 4) {
			System.out.println("*** Financial Management System Menu***");
			System.out.println("1.Deposit to Account");
			System.out.println("2.Withdraw to Account");
			System.out.println("3.Account Managemnet");
			System.out.println("4.Exit");
			System.out.println("Select one number between 1-4 :");
			num = input.nextInt();
			if (num == 1) {
				financialManager.DeposittoAccount();
			}
			else if (num == 2) {
				financialManager.WithdrawtoAccount();
			}
			else if (num == 3) {
				financialManager.AccountManagemnet();
			}
			else {
				continue;
			}
		}
	}
	
}

