package Lab3.decorator;

public class Main {
    public static void main (String[] args) {
        Beverage coffe = new Coffe();
        BeverageTopping milk = new Milk(coffe);
        Beverage sugar = new Sugar(milk);

        System.out.println(sugar.getCost());
        System.out.println(sugar.getDescription());

        Chocolate  chocolate = new Chocolate();
        Whip whip = new Whip(chocolate);
        Sugar sugar2 = new Sugar(whip);
        Milk milk1 = new Milk(sugar2);
        System.out.println(milk1.getCost());
        System.out.println(milk1.getDescription());



    }
}
