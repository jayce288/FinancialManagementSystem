
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FinancialManager financialManager = new FinancialManager(input);
		
		int num = -1;
		while (num != 5) {
			System.out.println("*** Financial Management System Menu***");
			System.out.println("1.Add Account");
			System.out.println("2.Delete Account");
			System.out.println("3.Edit Account");
			System.out.println("4.View Account");
			System.out.println("5.Exit");
			System.out.println("Select one number between 1-4 :");
			num = input.nextInt();
			if (num == 1) {
				financialManager.addAccount();
			}
			else if (num == 2) {
				financialManager.deleteAccount();
			}
			else if (num == 3) {
				financialManager.editAccount();
			}
			else if (num == 4) {
				financialManager.viewAccounts();
			}
			else {
				continue;
			}
		}
	}
	
}
