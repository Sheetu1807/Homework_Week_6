package Homework_Week_6;

import java.util.Scanner;
public class Pro18_Sum_Multiply_Subtract_Divide_Remainder {

    // Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

    // Test data
    //Input first number: 125
    //Input second number: 24

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number : ");
        int num1 = in.nextInt(); // local vatiable

        System.out.println("Input second number : ");
        int num2 = in.nextInt(); // local variable

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // Print statement
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // Print statement
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); // Print statement
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); // Print statement
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2)); // Print statement

    }

}
