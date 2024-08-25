import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Hello! What kind of pet do you have? " +
            "A dog, cat, or hamster?");
        Animal userPet = new Animal("animal");
        String type = kb.nextLine();
        System.out.println("Wonderful! What is your pet's name?");
        String petName = kb.nextLine();
        userPet.setName(petName);
        switch(type){
            case "dog":
                userPet = new Dog(petName);
                break;
            case "cat":
                userPet = new Cat(petName);
                break;
            case "hamster":
                userPet = new Hamster(petName);
                break;
        }
        userPet.makeNoise();
    }
}
