package Homework_Week_6;

public class Pro2_Static { // Declare class

    // Write a Java programme using the following steps.

    static int age = 20; // Static variable

    static String name = "Sheetal"; //Static variable


    static void disp(){ // Static method
        System.out.println("Age is :" +age); //Print static variable
        System.out.println("Name is :" +name); // Print static variable

    }
     public static void main(String[] args) { //Main method

         disp(); // static variable called directly

     }
}
