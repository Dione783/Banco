package Entities;
import Exceptions.AccountExceptions;

public class Account {
	private Integer number;
	private double balance;
	private String holder;
	private double withdrawLimit;
	
	public Account() {
		
	}
	

	public Account(String holder,Integer number, double balance, double withdrawLimit) {
		this.holder=holder;
		this.number = number;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber(){
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}




	public double getBalance() {
		return balance;
	}




	public void setBalance(double balance) {
		this.balance = balance;
	}




	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public String getHolder() {
		return holder;
	}



	public void setHolder(String holder) {
		this.holder = holder;
	}



	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	private void validateWithdraw(double amount) {
		if(amount > withdrawLimit) {
			throw new AccountExceptions("The amount exceds withdraw limit");
		}
		if(amount > balance) {
			throw new AccountExceptions("Not enough balance");
		}
	}

	public void withdraw(double amount){
		validateWithdraw(amount);
		balance-=amount;
		System.out.println(amount);
		}
	
	public void deposit(double amount) {
		balance+=amount;
	}
}