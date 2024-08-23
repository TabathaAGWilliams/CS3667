import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Hello! What kind of pet do you have?");
        String pet = kb.nextLine();
        System.out.println("Wonderful! What is your pet's name?");
        String petName = kb.nextLine();
    }
}
