package Lab2.ex3;

public abstract class Animal {

    protected int legs;

    public int getLegs() {
        return legs;
    }
    protected Animal (int legs) {
        this.legs = legs;
    }
    public void walk() {
        System.out.println("The animal has" +this.getLegs()+"legs");
    }
    abstract void eat();

}
