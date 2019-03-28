package ro.ubb.dp1819.lab2.exercises.component;

import ro.ubb.dp1819.lab2.exercises.CarPriceable;

public class Paint implements CarComponent {
    private String paint;
    private Long price;

    public Paint(String paint) {
        this.paint = paint;
    }

    @Override
    public void assignPrice() {
        switch (paint){
            case "red":
                this.price = 2L;
                break;
            case "white":
                this.price = 3L;
                break;
            case "black":
                this.price = 1L;
                break;
            case "blue":
                this.price = 4L;
                break;
            case "green":
                this.price = 1L;
                break;
            case "pink":
                this.price = 1L;
                break;
            case "yellow":
                this.price = 2L;
                break;
        }
    }

    @Override
    public String getComponent() {
        return paint;
    }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
