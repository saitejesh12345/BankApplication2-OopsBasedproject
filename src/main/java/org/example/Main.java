package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     //we'ill be creating a bank app today
        //features to be added
        //1.create bank account
        //2.withdraw balance
        //3.add balance
        //4.check balance
        System.out.println("first project - bank app");
       // Scanner sc = new Scanner(System.in);
        Bank sbiBankAccount = new SBIBankAccount(1000,"Aakash","Akansh@123");
        sbiBankAccount.addMoney(1000);

        System.out.println("total balance:" + sbiBankAccount.checkBalance());


        Boolean withDrawStatus = sbiBankAccount.withDrawMoney(200);
        if(Boolean.TRUE.equals(withDrawStatus)){
            System.out.println("Successfully withdraw money " +" "+  200 +  " from bank account  AxxxxNo");
        }else {
            System.out.println("Withdraw Unsuccesful");
        }
        int balance = sbiBankAccount.checkBalance();
        System.out.println("Remaining balance:" + balance);

//       SBIBankAccount sbiBankAccount2 = new SBIBankAccount();
//       sbiBankAccount2.setName("Abhishek");
//       sbiBankAccount2.setBalannce(10000);
//       sbiBankAccount2.setPassword("Amazon@123");
//        System.out.println(sbiBankAccount2.getBalance());


    }
}