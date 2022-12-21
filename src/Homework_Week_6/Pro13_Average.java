package Homework_Week_6;

import java.util.Scanner;

public class Pro13_Average {

    // Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int x1, x2, x3; // local variable

        System.out.println("Input first number: ");
        x1 = sc.nextInt(); //local variable

        System.out.println("Input Second number: ");
        x2 = sc.nextInt();//local variable

        System.out.println("Input Three number: ");
        x3 = sc.nextInt();//local variable

        System.out.println("Average of three numbers is: " + (x1 + x2 + x3)/3);

    }
}