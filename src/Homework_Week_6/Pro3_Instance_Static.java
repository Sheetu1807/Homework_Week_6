package Homework_Week_6;

public class Pro3_Instance_Static {

    // Write a Java programme using the following steps.

    String name = "Sheetal"; //Instance variable
    static String surname = "Dussooa"; //Static variable

    public static void main(String[] args) { //Main method
        Pro3_Instance_Static p= new Pro3_Instance_Static(); //Object created
        p.m1(); //Instance access via object
        m2();//direct access

    }
    public void m1() {
        System.out.println(name); //Print instance variable
        System.out.println(surname); // Print static variable

        }
        public static void m2(){
        Pro3_Instance_Static p= new Pro3_Instance_Static(); //Object created
            System.out.println(p.name);
            System.out.println(surname);
        }
    }
