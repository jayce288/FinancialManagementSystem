package financial;

import java.util.Scanner;

public class IBK������� extends Financial implements AccountInput {
	
	public IBK�������(FinancialKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Account ID:");
		int id = input.nextInt();
		this.setId(id);
		System.out.print("Account name:");
		String name = input.next();
		this.setName(name);
		System.out.print("Account number:");
		String number = input.next();
		this.setNumber(number);
	}
	
	public void printinfo() {
		String skind = "none";
		switch(this.kind) {
		case IBK�������:
			skind = "IBK���";
			break;
		case �츮����:
			skind = "�츮";
			break;
		case KB��������:
			skind = "KB����";
			break;
		case ��������:
			skind = "����";
			break;
		default:
		}
		System.out.println("kind: " + skind + "\n" + "account name: " + name + "\n" + "account id: " + id + "\n" +  "account number: " + number + "\n" + "account deposit " + deposit + "\n" + "account withdaw " + withdraw + "\n" + "account balance " + balance);
	}

}