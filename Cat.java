public class Cat extends Animal implements Pet{
    public Cat(String name)
    {
        super(name);
    }

    public void makeNoise() {
        System.out.printf("%s says meowwww", getName());
    }
}
