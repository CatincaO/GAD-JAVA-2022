package Lab2.ex1;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Tomy", 20, 4 );
        Fighter f2 = new Fighter("Moly", 25, 5 );

        BoxingMatch bm = new BoxingMatch(f1, f2);

        Fighter winner = bm.fight();
        System.out.println("Winner= " +winner.getName());

    }

}
