package Homework_Week_6;

public class Pro4_Both {

    //Write a Java programme using the following steps.

    String bag = "Tote bag"; //Instance variable
    String brand = "Chanel"; //Instance variable

    static String city = "Italy"; //Static variable
    static int num = 20; //Static variable

    public static void main(String[] args) { //Main method
        Pro4_Both z = new Pro4_Both(); // Create object
        z.m1(); //Instance method access through object
        m2(); // Static method called directly
    }

    public void m1(){
        System.out.println(bag);
        System.out.println(brand);

    }
    public static void m2() {
        Pro4_Both z = new Pro4_Both();
        System.out.println(city);
        System.out.println(num);

    }
}


