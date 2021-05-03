package financial;

import java.util.Scanner;

public class 快府篮青 extends Financial {
	
	public 快府篮青(FinancialKind kind) {
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
				break;
			}
			else {
			}
		}

	}
}