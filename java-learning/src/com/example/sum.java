package com.example;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();


        int sum = first + second;
        System.out.println("Sum is: " + sum);

        scanner.close();
    }
}
