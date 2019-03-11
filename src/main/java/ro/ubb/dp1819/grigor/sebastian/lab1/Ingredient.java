package ro.ubb.dp1819.grigor.sebastian.lab1;


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

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
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
}
