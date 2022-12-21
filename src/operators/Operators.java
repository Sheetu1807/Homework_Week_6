package operators;

public class Operators {

    public static void main(String[] args) {
        int a = 5; // Local variable
        int b = 5;
        int c = 10;


        //Airthmatic Operator

//        System.out.println("Addition is " + (a + b));
//        System.out.println("Subtraction is " + (c - a));
//        System.out.println("Multiplication is" + (a * c));
//        System.out.println("Division is " + (c / b));
//        System.out.println("Module is " + (a % b));
//        System.out.println("Increment is " + (++a));
//        System.out.println("Decrement is " + (--b));

        //Logical Operator

        boolean result = b>a && c>b;
        boolean result1 = a>b && c>b;
        System.out.println(result);
        System.out.println(result1);

        boolean result2 = a<b || a>b;
        System.out.println(result2);

//        boolean result3 = a!=c;
//        boolean result4 = a!=5;
//        System.out.println(result3);
//        System.out.println(result4);

        //Relational Operators

        boolean ans = a==b;
        System.out.println(ans);

        boolean ans1 = a!=b;
        System.out.println(ans1);







    }
}
