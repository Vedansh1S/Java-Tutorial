package com.arrays;
import java.util.Scanner;
import java.util.Arrays;

public class array_tutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[] arr = new int[5];
        //String[] s = new String[5];

        int[] arr1; // declaration, Stack memory
        arr1 = new int[5]; //initialization, object creation, heap memory
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i : arr1) {
            System.out.print(i + " ");
        }

        System.out.println(Arrays.toString(arr1));
        sc.close();
    }
}
