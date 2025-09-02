package com;

class BankingSystem {
    private double balance;
    private String Account_Type;

    public BankingSystem() {
        this.balance = 0;
        this.Account_Type = "saving";
        }

    public BankingSystem(double balance) {
        this.balance = balance;
        this.Account_Type = "Current";
    }

    public BankingSystem(double balance, String Account_Type) {
        this.balance = balance;
        this.Account_Type = Account_Type;
    }

    public void Display() {
        System.out.println("the balance is: " + this.balance);
        System.out.println("the account type is: " + this.Account_Type);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankingSystem person1 = new BankingSystem();
        person1.Display();

        BankingSystem person2 = new BankingSystem(200.0);
        person2.Display();

        BankingSystem person3 = new BankingSystem(1000.05, "American express");
        person3.Display();
    }

}
