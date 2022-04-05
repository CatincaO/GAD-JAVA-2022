package staticx;

public class Bicycle {
    private static int nbOfBicycles = 0;
    private String name;
    private int size;

    public static int getNbOfBicycles() {
        return nbOfBicycles;
    }

    public Bicycle(String name, int size) {
        this.name = name;
        this.size = size;
        nbOfBicycles ++;

    }

    public String toString() {
        return "Bicycle name" + name + "of size" + size;
    }

}
