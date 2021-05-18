package financial;


import java.util.Scanner;

public class 快府篮青 extends Financial {
	
	public 快府篮青(FinancialKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setAccountwithYN(input);
	}
	
	public void setAccountwithYN(Scanner input) {
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
		
	}
	
	public void printinfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + "account name: " + name + "\n" + "account id: " + id + "\n" +  "account number: " + number + "\n" + "account deposit " + deposit + "\n" + "account withdaw " + withdraw + "\n" + "account balance" + balance);
	}
}