package ro.ubb.dp1819.lab2.home;

public class CarPart {
    private int quantity;
    private String description;
    private String name;

    public CarPart(int quantity, String description, String name) {
        this.quantity = quantity;
        this.description = description;
        this.name = name;
    }

    public CarPart() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CarPart{" +
                "quantity=" + quantity +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder {
        private int quantity;
        private String description;
        private String name;

        public Builder() {
        }

        public CarPart buid(){
            return new CarPart(quantity,description,name);
        }

        public CarPart.Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public CarPart.Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public CarPart.Builder setName(String name) {
            this.name = name;
            return this;
        }
    }
}
