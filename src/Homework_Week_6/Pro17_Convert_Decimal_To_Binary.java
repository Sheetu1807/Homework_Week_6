package Homework_Week_6;

import java.util.Scanner;

public class Pro17_Convert_Decimal_To_Binary {

    // Write a Java program to convert a decimal number to binary number.

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a decimal number ::");
            int decimal = sc.nextInt(); //local variable

            String result = Integer.toBinaryString(decimal);
            System.out.println("Convert Binary value into decimal number is ::" + result);
        }
    }

