package Homework_Week_6;

public class Pro1_Instance {

    // Write a Java programme using the following steps.


String name = "Sheetal"; // Instance variable
String surname = "Dussooa"; // Instance variable

 public static void main(String[] args) { // Main method Declared
    Pro1_Instance z = new Pro1_Instance(); // Create object
    z.m1(); // Instance method through object

 }

 //Instance method

    public void m1(){

        System.out.println(name); // Print Instance variable
        System.out.println(surname); // Print Instance variable called
    }
}
