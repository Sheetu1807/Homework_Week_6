package constructor;

public class Test_Constructor {

    int eid;
    String name;

    Test_Constructor(int eid, String name){ //Declare Constructor
        this.eid = eid;
        this.name = name;
        System.out.println(eid);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Test_Constructor t = new Test_Constructor(101, "Sheetal");
        Test_Constructor t1 = new Test_Constructor(102, "John");
        Test_Constructor t2 = new Test_Constructor(102, "Mary");
    }
}
