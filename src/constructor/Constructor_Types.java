package constructor;

public class Constructor_Types {
    public Constructor_Types() {//Declare Zero Argument Constructor

            System.out.println("Zero Argument Constructor");
        }
            public Constructor_Types(int a) //Declare One Argument Constructor
            {
                System.out.println("One Argument Constructor");
                System.out.println(a);

            }

            public Constructor_Types(int a, int b) //Declare Two Argument Constructor
        {
            System.out.println("Two Argument Constructor");
            System.out.println(a);
            System.out.println(b);
        }

        public Constructor_Types(String name, int id, String lname){
            System.out.println(name);
            System.out.println(id);
            System.out.println(lname);

        }
        public static void main(String[] args) {
            Constructor_Types ct = new Constructor_Types(); // Calling zero Argument Constructor
            Constructor_Types ct1 = new Constructor_Types(10); //Calling One Argument Constructor
            Constructor_Types ct2 = new Constructor_Types(20); //Calling One Argument Constructor
            Constructor_Types ct3 = new Constructor_Types(100, 200); //Calling Two Argument Constructor
            Constructor_Types ct4 = new Constructor_Types("Codbuster", 100, "Testing"); //Calling Three Argument Constructor

        }
}



