
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FinancialManager financialManager = new FinancialManager(input);
		
		selectMenu(input, financialManager);
	}
	
	public static void selectMenu(Scanner input, FinancialManager financialManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					financialManager.addAccount();
					break;
				case 2:
					financialManager.deleteAccount();
					break;
				case 3:
					financialManager.editAccount();
					break;
				case 4:
					financialManager.viewAccounts();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 to 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Financial Management System Menu***");
		System.out.println("1.Add Account");
		System.out.println("2.Delete Account");
		System.out.println("3.Edit Account");
		System.out.println("4.View Account");
		System.out.println("5.Exit");
		System.out.println("Select one number between 1-5 :");
	}
	
}
