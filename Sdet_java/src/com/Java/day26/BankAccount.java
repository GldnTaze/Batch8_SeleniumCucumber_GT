package com.Java.day26;

public class BankAccount {

    double balance;
    String accountHolder;
    int accountNumber;

    public void deposit(double amount){
        System.out.println("depositing $"+amount+ "to"+accountNumber);
        balance+=amount;
    }
    public void showBalance(){
        System.out.println("-------------------");
        System.out.println("account holder is"+accountHolder);
        System.out.println("your account balance:"+balance);
    }


    public static void main(String[] args) {
        BankAccount benimHesabim=new BankAccount();
        benimHesabim.showBalance();
        benimHesabim.balance=124.45;
        benimHesabim.accountHolder="mr.ramazan";
        benimHesabim.accountNumber=123453224;

        benimHesabim.showBalance();
        benimHesabim.deposit(100.25);

        benimHesabim.showBalance();
    }
}
