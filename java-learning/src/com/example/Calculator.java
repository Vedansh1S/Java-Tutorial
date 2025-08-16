package com.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Your personal Calculator...");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the operator: ");
        char op = in.next().trim().charAt(0);

        boolean isvalid = true;
        int ans = 0;
        if (op == '+' || op == '-' || op == '*' || op == '/') {

            System.out.println("Enter the numbers: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            if (op == '+') {
                ans = num1 + num2;
            } else if (op == '-') {
                ans = num1 - num2;
            } else if (op == '*') {
                ans = num1 * num2;
            } else if (op == '/') {
                if (num2 != 0) {
                    ans = num1 / num2;
                } else {
                    isvalid = false;
                }
            } else {
                System.out.println("Enter valid expression");
            }
        } else {
            System.out.println("Enter valid operator...");
        }

        if (isvalid == true) {
            System.out.println("The final answer is: " + ans);
            System.out.println("Thank you for using this...");
        }
        else{
            System.out.println("Invalid");
        }

        in.close();
    }

}


/*
 Mistakes 
 '' - is for char
 " " - is for String
 if (op check) {
    number input
    if (check which operator){
    }
 }
    result;
 */