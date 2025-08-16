package com.example;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();

        System.out.println("Enter the digit to count occurance: ");
        int digit = in.nextInt();

        int count = 0; // to count the occurance of the digit
        while (number > 0){
            int rem = number % 10; // get the reminder 
            if (rem == digit){
                count++;
            }
            number /= 10; // to remove the last digit
        }

        System.out.println(count);
        
        in.close();
    }
}


