package Homework_Week_6;

public class Pro6_Radius {

    // Write a program to enter any radius value of the circle and find out the
    //area.(Formula of Area A=PI*r*r).

    public static void main(String[] args) { //main method
        float pi = 3.1452f, area;      // local variable
        int r = 5;      // local variable

        area = pi * r * r;

        System.out.println("Area of the circle is:" + area);
    }
}