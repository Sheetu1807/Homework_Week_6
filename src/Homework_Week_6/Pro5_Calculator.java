package Homework_Week_6;

public class Pro5_Calculator {

   // Write a program for a calculator with addition, subtraction, multiplication and division methods all with
    // parameters and use string concatenation methods.

        public static void main(String[] args) {
            Pro5_Calculator p = new Pro5_Calculator(); //create object
            addition(100,15); //call method using object name (Static) - Parameters
            subtraction(100,15); //call method directly (static) - Parameters
            p.multiplication(); //call method using object name - no parameters
            p.division(100,15); //call division method using object name - parameters
        }

        //Static Method 1
        //with parameters
        public static void addition(int o, int p) {

            System.out.println("Addition of " + o + " + " + p +  " = " + (o + p)); //Print statement with concatenation
        }

        //Static Method 2
        //with parameters
        public static void subtraction(int x, int y) {

            System.out.println("Subtraction of " + x + " - "+ y + " = " + (x - y)); //Print statement with concatenation
        }

        //instance method 1
        //empty parameters
        public void multiplication (){

            // Multiplication math to call answer o
            int x = 100;
            int y = 15;
            int z = x * y;
            System.out.println("Multiplication of " + x + " * "+ y + " = " + z); //Print statement with concatenation

        }

        //instance method 2
        //with parameters
        public void division (double a, double b){
            // Multiplication math to call answer c
            double c = a / b;
            System.out.println("Division of " + a + " / "+ b + " = " + c); //Print statement with concatenation
        }
    }
