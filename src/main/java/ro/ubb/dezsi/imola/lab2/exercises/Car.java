package ro.ubb.dezsi.imola.lab2.exercises;


import ro.ubb.dezsi.imola.lab2.exercises.component.*;
import ro.ubb.dezsi.imola.lab2.exercises.pricing.CarPricingComposite;
import ro.ubb.dezsi.imola.lab2.exercises.pricing.PriceableComponent;


public class Car extends CarPricingComposite implements Driveable{
      // private List<CarComponent> components = new ArrayList<CarComponent>();

     //  public List<CarComponent> getComponents(){return components;}
     //  public void setComponents(List<CarComponent> components){
     //      this.components = components;
     //  }
     //   public void addComponent(CarComponent component){
     //       this.components.add(component);
     //   }


        @Override
        public String toString(){
            StringBuilder s = new StringBuilder("Car: \n");
            for (PriceableComponent c: getElements())
                s.append(((CarComponent)c).getString()).append("\n");


            return s.toString();
        }
}
