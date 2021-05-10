package financial;

import java.util.Scanner;

public class IBK기업은행 extends Financial implements AccountInput {
	
	public IBK기업은행(FinancialKind kind) {
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
		case IBK기업은행:
			skind = "IBK기업";
			break;
		case 우리은행:
			skind = "우리";
			break;
		case KB국민은행:
			skind = "KB국민";
			break;
		case 농협은행:
			skind = "농협";
			break;
		default:
		}
		System.out.println("kind: " + skind + "\n" + "account name: " + name + "\n" + "account id: " + id + "\n" +  "account number: " + number + "\n" + "account deposit " + deposit + "\n" + "account withdaw " + withdraw + "\n" + "account balance " + balance);
	}

}