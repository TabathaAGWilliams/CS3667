public class Dog extends Animal implements Pet {
    public Dog(String name)
    {
        super(name);
    }
    public void makeNoise() {
        System.out.printf("%s says woof", getName());
    }
}
