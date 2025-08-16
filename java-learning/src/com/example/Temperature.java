package com.example;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Temperature in Celcius: ");
        float celcius = input.nextFloat();

        float farenhite = (celcius * 9 / 5 ) + 32;
        System.out.println("Temperatur in Farehite is: " + farenhite);

        input.close();

    }

}
