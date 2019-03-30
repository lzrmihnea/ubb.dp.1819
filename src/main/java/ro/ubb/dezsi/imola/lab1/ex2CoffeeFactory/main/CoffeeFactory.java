package ro.ubb.dezsi.imola.lab1.ex2CoffeeFactory.main;

class CoffeeFactory {

	 ICoffee GetCoffee(double waterCups, double coffeeCups, int foamedMilk, boolean ice)
	    {
	        if (waterCups == 2 && coffeeCups == 0.25 && foamedMilk == 0 && !ice) {
	        	return new Americano();
	        }else if (waterCups == 2 && coffeeCups == 0.25 && foamedMilk == 100 && !ice) {
	        	return new Cappuccino();
	        }else if (waterCups == 4 && coffeeCups == 0.25 && foamedMilk == 0 && !ice) {
	        	return new Espresso();
	        }else if (waterCups == 2 && coffeeCups == 0.25 && foamedMilk == 0 && ice){
	        	return new IcedCoffee();
	        } else {
	        	return null;
	        }
	    }
}
