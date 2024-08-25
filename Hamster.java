public class Hamster extends Animal implements Pet {
    public Hamster(String name)
    {
        super(name);
    }

    public void makeNoise() {
        System.out.printf("%s says *nibble nibble*", getName());
    }
}
