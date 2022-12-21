package static_block;

public class Static_Block {
    static // Declare static block
    {
        System.out.println("Java is a Robust Language.");
    }

    static   //Declare Instance Block
    {
        String name = "Sheetal";
        System.out.println("Instance Block");
        System.out.println(name);
    }

    static // Declared Static Block
    {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Static_Block m = new Static_Block();
        System.out.println("Codebuster Testing");
    }
    static {
        System.out.println("Java");

    }
    public Static_Block(){ //Declare Constructor
        System.out.println("Declared Constructor");

    }
}
