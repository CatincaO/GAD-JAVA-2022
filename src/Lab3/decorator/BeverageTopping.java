package Lab3.decorator;

public class BeverageTopping extends Beverage {
    protected  Beverage beverage;

    public BeverageTopping(Beverage beverage, int cost, String description) {
        super(cost, description);
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return getCost() + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return getDescription() + "." + beverage.getDescription();
    }
}
