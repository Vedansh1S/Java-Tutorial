package com.example;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Enter the String to check Uppercase or Lower case: ");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        char ch = word.trim().charAt(0);

        if ( ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("UpperCase");
        }
        input.close();
    }

}
