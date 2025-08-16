package com.example;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter number of digits for  the series: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");

        //int i = 2;
        // while (i <= n){
        //     int next = a + b;
        //     a = b;
        //     b = next;
        //     System.out.print(next + " ");
        //     i++;
        // }

        for ( int i = 2; i <= n; i++){
            int next = a + b;
            a = b;
            b = next;
            // int temp = b;
            // b = next;
            // a = temp;
            System.out.print(next + " ");
        }
        System.out.println("\n" + b);
        input.close();
    }

}
