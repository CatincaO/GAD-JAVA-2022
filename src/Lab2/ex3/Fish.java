package Lab2.ex3;

public class Fish extends Animal implements Pet{

    private String name;

    public Fish(){
        super(0);
    }
    public void walk(){
        System.out.println("Fish doesn't have legs");
    }

    @Override
    void eat() {
        System.out.println("Eat method for fish");

    }

    @Override
    public String getName() {
        return getName();
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public void play() {
        System.out.println("Play methode ");

    }
}
