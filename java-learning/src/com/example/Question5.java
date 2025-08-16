package com.example;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("Enter the number to reverse: ");
        Scanner in = new Scanner(System.in);
        int number =in.nextInt();

        int reversed = 0;
        while (number > 0){
            int rem = number % 10; // get the last digit
            reversed = reversed * 10 + rem; // to reverse the number
            number /= 10; // to remove the last digit from the number
        }
        System.out.println(reversed); 
        in.close();
    }
}
