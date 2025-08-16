package com.method;
import java.util.Scanner;

public class question {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    boolean b = armstrong(number);

    if (b){
        System.out.println("Yes");
    }
    else{System.out.println("No");}

    for ( int i = 100; i < 1000; i++){
        if (armstrong(i)){
            System.out.println("Number:" + i);
        }
    }
    sc.close();
    
}
    static boolean armstrong(int number){
        int temp = number;
        int reminder;
        int solution = 0;
        while(number > 0){
            reminder = number % 10;
            int cube = reminder * reminder * reminder;
            solution = solution + cube;
            number = number / 10;
        }

        return solution == temp;
        }

}
