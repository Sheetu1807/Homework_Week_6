package Homework_Week_6;

public class Pro14_Area_Perimeter_Of_Rectangle {

    // Write a Java program to print the area and perimeter of a rectangle.
    public static void main(String[] strings) {

        final double width = 5.5; //local variable
        final double height = 8.5; //local variable

        double perimeter = 2 * (height + width); //local variable

        double area = width * height; //local variable

        System.out.println("area is " +area);
        System.out.println("perimeter is " +perimeter);

    }
}
