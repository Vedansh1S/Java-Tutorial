package com;

public class class_and_object {
    public static void main(String[] args) {
        student student1 = new student();
        student1.name = "Vedansh Sharma";
        student1.roll_no = 21;
        student1.age = 21;
        student1.address = "Surat, gujarat, 394140";
        System.out.println(student1.name);

    }

    public static class student{
        String name;
        int roll_no;
        int age;
        String address;
    }
}
