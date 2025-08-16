package com.example;
import java.util.Scanner;

public class primitive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte b = 1;
        short s = 10;
        int i = 12;
        long l = 100000l;
        float f = 1.32433f;
        double d = 1.233454564;
        char c = 'A';
        char s1 = scanner.next().trim().charAt(0);
        System.out.println(s1);
        
        scanner.nextLine();

        String s2 = scanner.nextLine().trim();
        System.out.println(s2);
        boolean bo = false;
        
        float f1 = 35e3f;
        double d1 = 12E4d;
        
        System.out.println(f1);
        System.out.println(d1);

        System.out.println("Byte number is: " + b);
        System.out.println("Short : " + s);
        System.out.println("Integer is: " + i);
        System.out.println("Long number is: " + l);
        System.out.println("Float number is: " + f);
        System.out.println("Double number is: " + d);
        System.out.println("Character is: " + c);
        System.out.println("Boolean is: " + bo);

        scanner.close();
    }

}
