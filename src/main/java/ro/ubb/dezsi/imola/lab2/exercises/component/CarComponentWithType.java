package ro.ubb.dezsi.imola.lab2.exercises.component;

import ro.ubb.dezsi.imola.lab2.exercises.pricing.CarPricingLeaf;

// we use this class to give each subclass a type
// without having to rewrite this same code over and over
// otherwise it is the same
public abstract class CarComponentWithType extends CarPricingLeaf implements  CarComponent {
    private String type;
    public CarComponentWithType(String type){

        this.type = type;
    }
    String getType(){
        return this.type;
    }


}
