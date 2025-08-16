package com.example;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if (number > number2 && number > number3){
            System.out.println("Number1 is largest");
        }
        else if (number2 > number && number2 > number3){
            System.out.println("Number 2 is largest");
        }
        else {
            System.out.println("number 3 is largest");
        }

        input.close();
    }

}
