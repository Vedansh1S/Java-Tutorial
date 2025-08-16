package com.StringTutorial;

public class tutorial {
    public static void main(String[] args) {
        String name = "Vedansh";
        String name2 = "Vedansh";  
        System.out.println(name == name2); // true, because both refer to the same string literal in the string pool
        System.out.println(name.equals(name2)); // true, because the content is the same
        String name3 = new String("Vedansh"); // creates a new String object in heap memory
        System.out.println(name == name3); // false, because name3 refers to a different
        System.out.println(name.equals(name3)); // true, because the content is the same
        System.out.println(name.length()); // prints the length of the string
    
    }

}
