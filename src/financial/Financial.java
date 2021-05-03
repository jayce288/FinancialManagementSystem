package financial;

import java.util.Scanner;

public class Financial {
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

	public void setNumber(String number) {
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
		System.out.println("kind: " + skind + "account name: " + name + "\n" + "account id: " + id + "\n" +  "account number: " + number + "\n" + "account deposit " + deposit + "\n" + "account withdaw " + withdraw + "\n" + "account balance" + balance);
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
	
	public void balancecalculate() {
		
		balance = balance + deposit - withdraw;
		
	}
}
