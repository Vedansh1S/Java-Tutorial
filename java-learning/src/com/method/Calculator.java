package com.method;
import java.util.Scanner;

public class Calculator {

    // perform opperation
    public static void main(String[] args) {

        // take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of input: ");
        int count = sc.nextInt();

        if (count <= 1){
            System.out.println("Eneter at least two operators.");
        }

        // store in array
        int[] numbers = new int[count];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }

        // take operator
        System.out.print("Enter Operator: ");
        char op = sc.next().trim().charAt(0);

        if (op !='+' && op != '-' && op != '*' && op != '/'){
            System.out.println("Invalid operator");
        }
        sc.close();

        Calc(op, numbers);
    }

    public static void Calc(char op, int... numbers) {

        double result = 0.0d;
        switch (op) {
            case '+':
                result = 0.0d;
                for (int num : numbers) {
                    result += num;
                }
                break;

            case '-':
                result = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    result -= numbers[i];
                }
                break;
            case '*':
                result = 1;
                for (int i : numbers) {
                    result *= i;
                }
                break;
            case '/':
                result = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] == 0) {
                        System.out.println("Division not possible.");
                        break;
                    } 
                        result /= numbers[i];
                }
                break;

            default:
                System.out.println("Galat calculator.");
            }
            System.out.println("Result: " + result);
    }

}
