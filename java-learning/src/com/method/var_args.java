package com.method;

public class var_args {
    public static void main(String[] args) {
        variable_arguments();
        System.out.println();
        
        variable_arguments(21, 123, 34, 23, 12, 3);
        System.out.println();
    }

    static void variable_arguments(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
