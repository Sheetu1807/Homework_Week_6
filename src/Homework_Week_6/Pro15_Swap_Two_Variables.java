package Homework_Week_6;

public class Pro15_Swap_Two_Variables {

    // Write a Java program to swap two variables.

    public static void main(String[] args) {

        int x, y, temp; //local variable
        x = 25;
        y = 37;
        System.out.println("Before swapping : x, y = "+ x +"," + + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping : x, y = "+ x +"," + + y);

    }

}
