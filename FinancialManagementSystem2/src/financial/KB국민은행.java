package financial;

import java.util.Scanner;

public class KB±ππŒ¿∫«‡ extends Financial {
	
	protected String cardName;
	protected int cardId;
	protected String cardNumber;
	
	public KB±ππŒ¿∫«‡(FinancialKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have an account? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				setAccountID(input);
				setAccountName(input);
				setAccountNumber(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
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
				setCardID(input);
				setCardName(input);
				setCardNumber(input);
				break;
			}
				else if (answer == 'n' || answer == 'N') {
				break;
			}
				else {
			}
		}
	}
	
	public void printinfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + "\n" + "account name: " + name + "\n" + "account id: " + id + "\n" +  "account number: " + number + "\n" + "account deposit " + deposit + "\n" + "account withdaw " + withdraw + "\n" + "account balance " + balance + "\n" + "kind: " + skind + "\n"  + "card name: " + cardName + "\n" + "card id: " + cardId + "\n" +  "card number: " + cardNumber);
	}
}