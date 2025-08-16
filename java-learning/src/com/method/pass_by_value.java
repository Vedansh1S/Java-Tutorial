package com.method;

//import java.util.Scanner;

public class pass_by_value {

    // public void swap (String naam, String saruname){ // variable name can differ
    // from the one in main method

    // String temp = naam;
    // naam = saruname;
    // saruname = temp;

    // System.out.println(naam + saruname);

    // }
    public static void main(String[] args) { // variable name should be same across this main method
        // System.out.println("Enter Name and Surname: ");
        // Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // String surname = sc.nextLine();

        // System.out.println("Inside the Main Function");
        // System.out.println(name + surname);

        // System.out.println();
        // System.out.println("Inside the Swap function: ");
        // pass_by_value s = new pass_by_value();
        // s.swap(name, surname);

        // sc.close();

        String name = "vedansh";
        Greeting(name);
        System.out.println(name);
    }

    static void Greeting(String naam) {
        naam = "sharma";
    }
}
