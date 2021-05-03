package financial;

import java.util.Scanner;

public class KB±¹¹ÎÀºÇà extends Financial {
	
	public KB±¹¹ÎÀºÇà(FinancialKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have an account? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Account ID:");
				int id = input.nextInt();
				this.setId(id);
				System.out.print("Account name:");
				String name = input.next();
				this.setName(name);
				System.out.print("Account number:");
				String number = input.next();
				this.setNumber(number);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setName("");
				this.setNumber("");
				break;
			}
			else {
			}
		}
		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a credit card? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Card ID:");
				int id = input.nextInt();
				this.setId(id);
				System.out.print("Card name:");
				String name = input.next();
				this.setName(name);
				System.out.print("Card number:");
				String number = input.next();
				this.setNumber(number);
				break;
			}
				else if (answer == 'n' || answer == 'N') {
					this.setName("");
					this.setNumber("");
				break;
			}
				else {
			}
		}
	}
	
	public void printinfo() {
		String skind = "none";
		switch(this.kind) {
		case IBK±â¾÷ÀºÇà:
			skind = "IBK±â¾÷";
			break;
		case ¿ì¸®ÀºÇà:
			skind = "¿ì¸®";
			break;
		case KB±¹¹ÎÀºÇà:
			skind = "KB±¹¹Î";
			break;
		case ³óÇùÀºÇà:
			skind = "³óÇù";
			break;
		default:
		}
		System.out.println("kind: " + skind + "account name: " + name + "\n" + "account id: " + id + "\n" +  "account number: " + number + "\n" + "account deposit" + deposit + "\n" + "account withdaw" + withdraw + "\n" + "account balance" + balance + "\n" + "kind: " + skind + "card name: " + name + "\n" + "card id: " + id + "\n" +  "card number: " + number + "\n" + "Amount used" + withdraw);
	}

}
