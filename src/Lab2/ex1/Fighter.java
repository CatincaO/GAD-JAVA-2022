package Lab2.ex1;

import java.util.Random;

public class Fighter {

    private final String name;
    private int health;
    private final int damagePerHealth;
    public String getName() {
        return name;
    }

    //private String name;

    public int getHealth() {
        return health;
    }

//    private int health;
//    private int damagePerHealth;

    public Fighter(String name, int damagePerHealth, int health) {
        this.name = name;
        this.damagePerHealth = damagePerHealth;
        this.health = health;
    }

    public void attack(Fighter opponent) {

        opponent.health -= this.damagePerHealth;
    }
}
