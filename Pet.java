public abstract class Pet {
    protected String name;

    /**
     * One-arg constructor.
     * @param name type of pet
     */
    public Pet(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract void makeNoise();
}
