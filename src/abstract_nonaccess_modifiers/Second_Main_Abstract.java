package abstract_nonaccess_modifiers;

public class Second_Main_Abstract {
    public static void main(String[] args) {
        Student_Abstract myObj = new Student_Abstract();
        System.out.println(myObj.x); //call variable from main abstract class
        System.out.println(myObj.name);
        myObj.m1(); //Call abstract method
    }
}
