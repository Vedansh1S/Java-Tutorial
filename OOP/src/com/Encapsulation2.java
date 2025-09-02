package com;

class Bank {
    private double balance;

    public Bank(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public double getbalance(){
        return this.balance;
    }

    public void deposite(double amount){
        if (amount > 0){
            this.balance +=amount;
            System.out.println("balance after depositing is: " + this.balance);
        }
        else{
            System.out.println("enter deposite amount in positive numbers. Thanks you");
        }
    }

    public void withdrew_money(double amount){
        if (amount <= balance){
            this.balance -= amount;
            System.out.println("Balance after withrawing is: " + this.balance);
        }
        else{
            System.out.println("enter valide amount to withdraw.");
        }
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        Bank person1 = new Bank(500);
        person1.getbalance();
        System.out.println("current balance is: " + person1.getbalance());

        person1.deposite(100);

        person1.withdrew_money(600);
    }

}
