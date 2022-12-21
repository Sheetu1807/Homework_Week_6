package Homework_Week_6;

public class Pro16_Two_Binary_Numbers {

    public static void main(String[] args) {
        // two binary numbers in string format
        String binarynum0 = "10", binarynum1 = "11"; // local variable

        // converting strings into binary format numbers
        Integer a = Integer.parseInt(binarynum0, 2);
        Integer b = Integer.parseInt(binarynum1, 2);

        // adding two integers
        Integer output = a  + b;

        // converting final output back to Binary Integer
        System.out.println(Integer.toBinaryString(output));
    }
}
