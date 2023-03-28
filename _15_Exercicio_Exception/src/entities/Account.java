package entities;

import Exceptions.AccountException;

public class Account {
	private Integer number;
	private char holder;
	private Double balance;
	private Double withdrawLimit;
	private Double withdraw;
	
	public Account(Integer number, char holder, Double balance, Double withdrawLimit, Double withdraw) throws AccountException{
		
		if(withdraw > withdrawLimit) {
			throw new AccountException("the amount exceeds withdraw limit");
		}
		if(withdraw >= balance) {
			throw new AccountException("not enough balance");
		}
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
		this.withdraw = withdraw;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public char getHolder() {
		return holder;
	}

	public void setHolder(char holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double withdraw() {
		return balance -= withdraw;
	}
	public String retirada(Double withdrawLimit,Double withdraw, Double balance) throws AccountException {
		
		this.withdrawLimit = withdrawLimit;
		this.withdraw = withdraw;
		this.balance = balance;
		return null;
	}

	
}
