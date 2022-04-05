package Lab2.ex3;

public class Cat extends Animal implements Pet {
    public String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        super(4);
        this.name = " ";
    }



    protected Cat(int legs) {
        super(legs);
    }


    @Override
    void eat() {
        System.out.println("THis is the eat method");

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
        System.out.println("PLay methode");

    }
}
