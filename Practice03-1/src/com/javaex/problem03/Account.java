package com.javaex.problem03;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    Account(String accountNo) {
    	this.accountNo = accountNo;
    }
    
    //필요한 메소드 작성
    
    public int deposit(int money) {
    	return balance += money;
    }
    
    public int withdraw(int money) {
    	return balance -= money;
    }
    
    public void showBalance() {
    	System.out.print(balance);
    }

	public String getAccountNo() {
		return accountNo;
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
