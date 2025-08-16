package com.example;

import java.util.Scanner;

public class casting_conversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Type conversion - Example 1 - destination bigger than source
        float value = scanner.nextInt();
        System.out.println("Float Valule: " + value);

        int conversion = scanner.nextInt();
        System.out.println("Converted Integer Value: " + conversion);

        // Type conversion - Example 2
        int i = 100;
        double d = i;

        System.out.println("I value is: " + i);
        System.out.println("D value is: " + d);

        // Type casting - bigger to smaller
        float f = 100.23f;
        int i1 = (int) f;
        System.out.println("f: " + f);
        System.out.println("i1: " + i1);

        int i2 = 257;
        byte a = (byte)(i2);
        System.out.println("i2: " + i2);
        System.out.println("a: " + a);

        int ii = 1000;
        byte b = 7;
        b += ii;            //b = (byte)(b + ii); Not needed as += operator are exception to type promotion rules
        System.out.println("b: " + b);

        scanner.close();
    }
}
