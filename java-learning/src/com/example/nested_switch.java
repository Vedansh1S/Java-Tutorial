package com.example;

import java.util.Scanner;

public class nested_switch {

    public static void main(String[] args) {
        System.out.println("Enter state and district to view ppopulation: ");
        Scanner in = new Scanner(System.in);
        String State = in.next();
        String District = in.next();

        switch (State.toLowerCase()) {
            case "gujarat" -> {
                switch (District.toLowerCase()) {
                    case "surat" -> System.out.println("Population: 1 million");
                    case "bardoli" -> System.out.println("Population: 100k");
                    default -> System.out.println("District not found in Gujarat.");

                }
            }

            case "maharashtra" -> {
                switch (District.toLowerCase()) {
                    case "mumbai" -> System.out.println("Population: 2 million");
                    case "pune" -> System.out.println("Population: 500k");
                    default -> System.out.println("District not found in Maharashtra.");

                }
            }
            default -> System.out.println("Aawarra, pagal, deevana");
        }

        System.out.println("Thank you for using this...");
        System.out.println("Have a nice day");
        System.out.println("Jai Shree Ram");


        System.out.println("Enter the Employee name and department to view salary: ");
        String Department = in.next();
        String employee = in.next();
        //Double salary = in.nextDouble();

        switch (Department) {
            case "Software" -> {
                switch (employee) {
                    case "Vedansh" -> System.out.println("Salary: 1cr");
                    case "Devanshi" -> System.out.println("Salary: 10 lakh");
                    default -> System.out.println("Ye gareeb sala");
                }
            }
            case "QA" -> {
                switch (employee) {
                    case "Pradeep" -> System.out.println("Salary: 24 lakh");
                    case "Sakshi" -> System.out.println("Salary: 7 lakh");
                    default -> System.out.println("Iski job to gayi");
                }
            }
            default -> System.out.println("Get a job bitch");
        }

        in.close();
    }
}
