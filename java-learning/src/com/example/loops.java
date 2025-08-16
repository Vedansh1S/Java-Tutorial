package com.example;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        
        //For Loop
        for (int i = 0; i <= 5; i++) {
            System.out.println("Current number is: " + i);
        }

        Scanner input = new Scanner(System.in);
        
        int nums = input.nextInt();
        for (int i = 0; i < nums; i++) {
            System.out.println("Happy " + i + " Birthday.");
        }


        // While Loop
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        // Do-while loop
        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x <= 10);

        input.close();
    }
}
