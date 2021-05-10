
import java.util.ArrayList;
import java.util.Scanner;

import financial.AccountInput;
import financial.FinancialKind;
import financial.IBK�������;
import financial.KB��������;
import financial.�츮����;

public class FinancialManager {
	ArrayList<AccountInput> accounts = new ArrayList();
	Scanner input;
	FinancialManager(Scanner input) {
		this.input = input;
	}
	public void addAccount() {
		int kind = 0;
		AccountInput accountInput;
		while (kind != 1 && kind != 2) {
			System.out.print("1 for IBK�������\n");
			System.out.print("2 for KB��������\n");
			System.out.print("3 for �츮����\n");
			System.out.print("Select num 1, 2, 3 Bank Kind: ");
			kind = input.nextInt();
			if (kind == 1) {
				accountInput = new IBK�������(FinancialKind.IBK�������);
				accountInput.getUserInput(input);
				accounts.add(accountInput);	
				break;
			}
			else if (kind == 2) {
				accountInput = new �츮����(FinancialKind.�츮����);
				accountInput.getUserInput(input);
				accounts.add(accountInput);
				break;
			}
			else if (kind == 3) {
				accountInput = new KB��������(FinancialKind.KB��������);
				accountInput.getUserInput(input);
				accounts.add(accountInput);	
				break;
			}
			else {
				System.out.print("Select num for Student Kind between 1 and 2: ");
			}
		}
	}
	
	public void deleteAccount() {
		System.out.print("Account ID:");
		int accountId = input.nextInt();
		int index = -1;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getId()  == accountId) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			accounts.remove(index);
			System.out.println("the account" + accountId + "is deleted");
		}
		else {
			System.out.println("the student has not been registered");
			return;
		}
	}
	
	public void editAccount() {
		System.out.print("Account ID:");
		int accountId = input.nextInt();
		for (int i = 0; i < accounts.size(); i++) {
			AccountInput accountInput = accounts.get(i);
			if (accountInput.getId() == accountId) {
				int num = -1;
				while (num != 6) {
					System.out.println("*** Account Info Edit Menu ***");
					System.out.println("1.Edit Id");
					System.out.println("2.Edit Name");
					System.out.println("3.Edit Number"); 	
					System.out.println("4.Edit deposit");
					System.out.println("5.Edit withdraw");
					System.out.println("6.Exit");
					System.out.println("Select one number between 1-6 :");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Account Id:");
						int id = input.nextInt();
						accountInput.setId(id);
					}
					else if (num == 2) {
						System.out.print("Account Name:");
						String name = input.next();
						accountInput.setName(name);
					}
					else if (num == 3) {
						System.out.print("Account Number:");
						String number = input.next();
						accountInput.setNumber(number);
					}
					else if (num == 4) {
						System.out.print("Account deposit:");
						int deposit = input.nextInt();
						accountInput.setDeposit(deposit);
					}
					else if (num == 5) {
						System.out.print("Account withdraw:");
						int withdraw = input.nextInt();
						accountInput.setWithdraw(withdraw);
					}
					else {
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

}