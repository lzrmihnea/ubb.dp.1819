package ro.ubb.dp1819.grigor.sebastian.lab1.drinks;


import java.util.Objects;

public class Ingredient {
    private String quantity;
    private String unit;
    private String name;
    private String adjective;

    public Ingredient(String quantity, String unit, String name) {
        this.quantity = quantity;
        this.unit = unit;
        this.name = name;
    }

    public Ingredient(String quantity, String unit, String name, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.name = name;
        this.adjective = adjective;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public String getAdjective() {
        return adjective;
    }

    @Override
    public String toString() {
        if (adjective != null)
            return "Ingredient{" +
                    "quantity='" + quantity + '\'' +
                    ", unit='" + unit + '\'' +
                    ", name='" + name + '\'' +
                    ", adjective='" + adjective + '\'' +
                    '}';
        return "Ingredient{" +
                "quantity='" + quantity + '\'' +
                ", unit='" + unit + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return quantity.equals(that.quantity) &&
                unit.equals(that.unit) &&
                name.equals(that.name) &&
                Objects.equals(adjective, that.adjective);
    }
}
