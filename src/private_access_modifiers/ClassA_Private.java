package private_access_modifiers;

public class ClassA_Private {
    private String text = "Codebuster Testing";
    private int x = 230;
    private String email = "xyz@gmailcom";

    public static void main(String[] args) {
        ClassA_Private z = new ClassA_Private();
        System.out.println(z.x);
        System.out.println(z.text);
        System.out.println(z.email);

    }
}
