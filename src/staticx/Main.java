package staticx;

public class Main {
    public static void main(String[] args) {
        System.out.println("Static example:");

        Bicycle b1 = new Bicycle("B1", 2);
        System.out.println("Number of bic" +Bicycle.getNbOfBicycles());

        Bicycle b2 = new Bicycle("B2", 4);
        System.out.println("Number of bic" +Bicycle.getNbOfBicycles());

        Bicycle b3 = new Bicycle("B3", 5);
        System.out.println("Number of bic" +Bicycle.getNbOfBicycles());


    }
}
