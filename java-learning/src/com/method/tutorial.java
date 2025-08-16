package com.method;
import java.util.Scanner;

public class tutorial {
    
    public static String greeting(String name){
        String greet = ("Hello " + name);
        return greet;
    }

    public  int sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bolu = sc.next();
        String greet = greeting(bolu); // input using keyboard
        System.out.println(greet);
        
        String greet2 = greeting("Sharma ji"); // hardcoded
        System.out.println(greet2);
        
        String greet3 = greeting("Namaste"); // hardcoded
        System.out.println(greet3);
        
        tutorial t = new tutorial();
        int total = t.sum(5, 6);
        System.out.println(total);


        //int s = sum(10, 1); // can be executed with 'static' before the method name
        //System.out.println(s);

        sc.close();
    }
}