package com.example;
import java.util.Scanner;

public class tutorial {
    public static void main(String[] args){
        System.out.println("Hello form the package folder.");
        System.out.println("Form vedANSH PACKAGE and tutorial class.");
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter you name: ");
        String name = input.nextLine();
        System.out.println("hello " + name);

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Hello " + name + ".Your age is next 5 year will be " + (age + 5));

        input.close();
        System.out.println("Thanks for using this scanner and program...");
    }
}
