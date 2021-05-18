package financial;

import java.util.Scanner;

public class IBK기업은행 extends Financial {
	
	public IBK기업은행(FinancialKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setAccountID(input);
		setAccountName(input);
		setAccountNumber(input);
	}
	
	public void printinfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + "\n" + "account name: " + name + "\n" + "account id: " + id + "\n" +  "account number: " + number + "\n" + "account deposit " + deposit + "\n" + "account withdaw " + withdraw + "\n" + "account balance " + balance);
	}

}