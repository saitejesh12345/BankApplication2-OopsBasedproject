package org.example;

import java.util.UUID;

public class SBIBankAccount implements Bank{

 private  int balance;

 private double balannce;

 private String name;

    private  int roi; //lets assume it is fixed for now 5%

    private String  password;

    private String  accountNumber;

    public SBIBankAccount(int balance, String name, String password) {
        this.balance = balance;
        this.name = name;
        this.password = password;
        this.accountNumber = UUID.randomUUID().toString();
        this.roi = 5;
    }

    public SBIBankAccount(String name, String password) {
        this.name = name;
        this.password = password;
        this.balance = 0;
        this.accountNumber = UUID.randomUUID().toString();
        this.roi = 5;
    }

    public SBIBankAccount() {
    }

    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public Boolean addMoney(int money) {
      balance +=money;
      return true;
    }

    @Override
    public Boolean withDrawMoney(int money) {
       if(balance < money) {
           return false;
       }
       else {
           balance = balance - money;
           return true;
       }
    }

    @Override
    public int getROI() {
        return 0;
    }

    @Override
    public int totalInterest(int loanAmount,int timeInYears) {
        return  loanAmount * roi * timeInYears / 100;
    }

    public int getBalance() {
        return balance;
    }



    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getBalannce() {
        return balannce;
    }

    public void setBalannce(double balannce) {
        this.balannce = balannce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
