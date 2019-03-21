package ro.ubb.dezsi.imola.src.ex3Builder.main;

public class Coffee {
    private double waterCups;
    private double coffeeCups;
    private int foamedMilk;
    private boolean ice;
    @Override
    public String toString() {
        return "Coffee [waterCups=" + waterCups + ", coffeeCups=" + coffeeCups + ", foamedMilk=" + foamedMilk + ", ice="
                + ice + "]";
    }

    public double getWaterCups() {
        return waterCups;
    }

    public void setWaterCups(double waterCups) {
        this.waterCups = waterCups;
    }

    public double getCoffeeCups() {
        return coffeeCups;
    }

    public void setCoffeeCups(double coffeeCups) {
        this.coffeeCups = coffeeCups;
    }

    public int getFoamedMilk() {
        return foamedMilk;
    }

    public void setFoamedMilk(int foamedMilk) {
        this.foamedMilk = foamedMilk;
    }

    public boolean isIce() {
        return ice;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }
}
