package bank;

public class Bank {
	
	private int number;
	private String holder;
	private double balance;
	
	public Bank(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Bank(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "Account " 
				+ number
				+ " Holder: " 
				+ holder
				+ " Balance: " 
				+ balance;
	}
	
	public double depositSoma(double soma) {
		return balance += soma;
	}
	public double depositMenos(double menos) {
		return balance -= menos + 5.0;
	}
}
