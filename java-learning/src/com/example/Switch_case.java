package com.example;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter fruit name: ");
        String fruit = in.next();
        
        switch (fruit) {
            case "mango":
                System.out.println("good");
                break;
            case "orange":
                System.out.println("orange in color");
                break;
            case "dragon_fruit":
                System.out.println("not so good");
                break;
            default:
                System.out.println("Maa chuda lodu");
        }

        System.out.println("Enter the number to see the day: ");
        int number = in.nextInt();
        String lord_day;

        switch (number) {
            case 1:
                System.out.println("Monday");
                lord_day = "Shiv Ji";
                break;

            case 2:
                System.out.println("Tuesday");
                lord_day = "Hanuman ji";
                break;
            case 3:
                System.out.println("wednesday");
                lord_day = "Ganpati Ji";
                break;
            case 4:
                System.out.println("Thursday");
                lord_day = "Sai Baba";
                break;
            case 5:
                System.out.println("Friday");
                lord_day = "Mata rani";
                break;

            default:
                System.out.println("Weekend");
                lord_day = "No one";
        }
        System.out.println(lord_day);

        System.out.println("\nEnhanced Switch case");
        System.out.println("Enter the day");
        int days = in.nextInt();
        switch (days){
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Bhura wakht");
        }

        System.out.println("Fruits le lo");
        String fruits = in.next();
        switch (fruits){
            case "Mango","Orange", "Apple", "Kiwi" -> System.out.println("Good fruits. W...");
            case "Karela", "Parwal" -> System.out.println("Bad fruits");
            default -> System.out.println("Pizza is the best"); 
        }

        in.close();
    }

}
