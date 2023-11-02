package org.example;

public interface Bank {

    int checkBalance();
    Boolean addMoney(int money);

    Boolean withDrawMoney(int money);

    int getROI(); //Rate of Intrest

    int totalInterest(int loanAmount,int timeInYears);
}
