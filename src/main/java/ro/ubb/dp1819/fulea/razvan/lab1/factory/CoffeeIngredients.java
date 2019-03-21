package ro.ubb.dp1819.fulea.razvan.lab1.factory;

class CoffeeIngredients {
    private Integer waterCups;
    private Double beanCups;
    private Integer milk;
    private Integer whiskey;

    public CoffeeIngredients() {
    }



    public Integer getWaterCups() {
        return waterCups;
    }

    public void setWaterCups(Integer waterCups) {
        this.waterCups = waterCups;
    }

    public Double getBeanCups() {
        return beanCups;
    }

    public void setBeanCups(Double beanCups) {
        this.beanCups = beanCups;
    }

    public Integer getMilk() {
        return milk;
    }

    public void setMilk(Integer milk) {
        this.milk = milk;
    }

    public Integer getWhiskey() {
        return whiskey;
    }

    public void setWhiskey(Integer whiskey) {
        this.whiskey = whiskey;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("CoffeeIngredients{\n");
        if (waterCups != null) {
            result.append("waterCups=").append(waterCups).append(",\n");
        }
        if (beanCups != null) {
            result.append("beanCups=").append(beanCups).append(",\n");
        }
        if (milk != null) {
            result.append("milk=").append(milk).append(",\n");
        }
        if (whiskey != null) {
            result.append("whiskey=").append(whiskey).append("\n");
        }
        result.append("}");
        return result.toString();
    }
}