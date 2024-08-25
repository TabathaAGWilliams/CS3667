public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Animals make different noises.");
        System.out.printf("I am unsure what sound %s makes.", getName());
    }
}
