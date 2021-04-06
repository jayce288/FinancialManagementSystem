public class Financial {
	
	int Deposit; 
	int Withdraw;
	int Balance;
	
	public Financial() {
	}
	
	public Financial(int Deposit, int Withdraw, int Balance) {
		this.Deposit = Deposit;
		this.Withdraw = Withdraw;
		this.Balance = Balance;
	}

	public void printinfo() {
		System.out.println("Deposit: " + Deposit + "Withdraw: " + Withdraw + "Balance: " + Balance);
	}

}
