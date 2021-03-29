import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int num = 4;
		
		while (num != 5) {
			System.out.println("*** Financial Management System Menu***");
			System.out.println("1.Deposit to Account");
			System.out.println("2.Withdraw to Account");
			System.out.println("3.Account Managemnet");
			System.out.println("4.Show a Menu");
			System.out.println("5.Exit");
			System.out.println("Select one number between 1-4 :");
			num = Input.nextInt();
			if (num == 1) {
				DeposittoAccount();
			}
			else if (num == 2) {
				WithdrawtoAccount();
			}
			else if (num == 3) {
				AccountManagemnet();
			}
			else {
				continue;
			}
		}
	}
	
	public static void DeposittoAccount() {
		Scanner Input = new Scanner(System.in);
		System.out.print("Deposit:");
		int Deposit = Input.nextInt();
		System.out.println(Deposit);
	}
	
	public static void WithdrawtoAccount() {
		Scanner Input = new Scanner(System.in);
		System.out.print("Withdraw:");
		int Withdraw = Input.nextInt();
		System.out.println(Withdraw);
	}
	
	public static void AccountManagemnet() {
		Scanner Input = new Scanner(System.in);
		System.out.println("Today Deposit:");
		System.out.println("Today Withdraw:");
		System.out.println("Current Balance:");
	}
}

