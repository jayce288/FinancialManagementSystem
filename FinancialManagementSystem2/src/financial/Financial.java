package financial;
import java.io.Serializable;
import java.util.Scanner;

import exceptions.AccountNumberFormatException;

public abstract class Financial implements AccountInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1737513610961292322L;
	
	protected FinancialKind kind = FinancialKind.IBK±â¾÷ÀºÇà;
	protected String name;
	protected int id;
	protected String number;
	protected int deposit;
	protected int withdraw;
	protected int balance;

	public Financial() {
	}
	
	public Financial(FinancialKind kind) {
		this.kind = kind;
	}
	
	public Financial(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Financial(String name, int id, String number) {
		this.name = name;
		this.id = id;
		this.number= number;
	}
	
	public Financial(FinancialKind kind, String name, int id, String number) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.number= number;
	}
	
	public Financial(String name, int id, String number, int deposit, int withdraw, int balance) {
		this.name = name;
		this.id = id;
		this.number = number;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.balance = balance;
	}
	
	public FinancialKind getKind() {
		return kind;
	}

	public void setKind(FinancialKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) throws AccountNumberFormatException{
		if (!number.contains("-")) {
			throw new AccountNumberFormatException();
		}
		this.number = number;
	}
	
	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = this.deposit + deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = this.withdraw + withdraw;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void balancecalculate() {
		
		balance = balance + deposit - withdraw;
		
	}
	
	public void setAccountID(Scanner input) {
		System.out.print("Account Id:");
		int id = input.nextInt();
		this.setId(id);
	}
	
	public void setAccountName(Scanner input) {
		System.out.print("Account Name:");
		String name = input.next();
		this.setName(name);
	}
	
	public void setAccountNumber(Scanner input) {
		String number = "";
		while(!number.contains("-")) {
			System.out.print("Account Number:");
			number = input.next();
			try {
				this.setNumber(number);
			} catch (AccountNumberFormatException e) {
				System.out.println("Incorrect AccountNumber format, put the account number that contains -");
			}
		}
	}
	
	public void setAccountDeposit(Scanner input) {
		System.out.print("Account deposit:");
		int deposit = input.nextInt();
		this.setDeposit(deposit);
	}
	
	public void setAccountWithdraw(Scanner input) {
		System.out.print("Account withdraw:");
		int withdraw = input.nextInt();
		this.setWithdraw(withdraw);
	}
	
	public void setCardID(Scanner input) {
		System.out.print("Card Id:");
		int id = input.nextInt();
		this.setId(id);
	}
	
	public void setCardName(Scanner input) {
		System.out.print("Card Name:");
		String name = input.next();
		this.setName(name);
	}
	
	public void setCardNumber(Scanner input) {
		String number = "";
		while(!number.contains("-")) {
			System.out.print("Card Number:");
			number = input.next();
			try {
				this.setNumber(number);
			} catch (AccountNumberFormatException e) {
				System.out.println("Incorrect CardNumber format, put the card number that contains -");
			}
		}
	}
	
	public String getKindString() {
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
		return skind;
	}
}