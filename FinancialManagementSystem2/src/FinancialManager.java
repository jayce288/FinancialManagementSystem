
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import financial.AccountInput;
import financial.FinancialKind;
import financial.IBK기업은행;
import financial.KB국민은행;
import financial.우리은행;

public class FinancialManager {
	ArrayList<AccountInput> accounts = new ArrayList();
	Scanner input;
	FinancialManager(Scanner input) {
		this.input = input;
	}
	public void addAccount() {
		int kind = 0;
		AccountInput accountInput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1 for IBK기업은행");
				System.out.println("2 for KB국민은행");
				System.out.println("3 for 우리은행");
				System.out.print("Select num 1, 2, 3 Bank Kind: ");
				kind = input.nextInt();
				if (kind == 1) {
					accountInput = new IBK기업은행(FinancialKind.IBK기업은행);
					accountInput.getUserInput(input);
					accounts.add(accountInput);	
					break;
				}
				else if (kind == 2) {
					accountInput = new 우리은행(FinancialKind.우리은행);
					accountInput.getUserInput(input);
					accounts.add(accountInput);
					break;
				}
				else if (kind == 3) {
					accountInput = new KB국민은행(FinancialKind.KB국민은행);
					accountInput.getUserInput(input);
					accounts.add(accountInput);	
					break;
				}
				else {
					System.out.println("Select num for Student Kind between 1 and 3");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 to 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	
	public void deleteAccount() {
		System.out.print("Account ID:");
		int accountId = input.nextInt();
		int index = findIndex(accountId);
		removefromAccounts(index, accountId);
	}
	
	public int findIndex(int accountId) {
		int index = -1;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getId()  == accountId) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromAccounts(int index, int accountId) {
		if (index >= 0) {
			accounts.remove(index);
			System.out.println("the account " + accountId + "is deleted");
			return 1;
		}
		else {
			System.out.println("the student has not been registered");
			return -1;
		}
	}
	
	public void editAccount() {
		System.out.print("Account ID:");
		int accountId = input.nextInt();
		for (int i = 0; i < accounts.size(); i++) {
			AccountInput account = accounts.get(i);
			if (account.getId() == accountId) {
				int num = -1;
				while (num != 6) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						account.setAccountID(input);
						break;
					case 2:
						account.setAccountName(input);
						break;
					case 3:
						account.setAccountNumber(input);
						break;
					case 4:
						account.setAccountDeposit(input);
						break;
					case 5:
						account.setAccountWithdraw(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void viewAccounts() { 
//		System.out.print("Account ID:");
//		int accountId = input.nextInt();
		System.out.println("# of registered accounts: " + accounts.size());
		for (int i = 0; i < accounts.size(); i++) {
			accounts.get(i).balancecalculate();
			accounts.get(i).printinfo();
		}
		
	}
	
	public void showEditMenu() {
		System.out.println("*** Account Info Edit Menu ***");
		System.out.println("1.Edit Id");
		System.out.println("2.Edit Name");
		System.out.println("3.Edit Number"); 	
		System.out.println("4.Edit deposit");
		System.out.println("5.Edit withdraw");
		System.out.println("6.Exit");
		System.out.println("Select one number between 1-6 :");
	}

}