package ro.ubb.dezsi.imola.lab1.ex3Builder.main;

class CoffeeBuilder {

	BuilderW builder(){
		return new BuilderW();
	}

	public class BuilderW {

		BuilderC addWater(double waterCups) {
			return new BuilderC(waterCups);
			}
	}

	public class BuilderC {
		private double waterCups;

		BuilderC(double waterCups){
			this.waterCups = waterCups;
		}
		BuilderO addCoffeeCups(double coffeeCups) {
			return new BuilderO(this.waterCups, coffeeCups);
		}
	}

	public class BuilderO {
		private double waterCups;
		private double coffeeCups;
		private int foamedMilk;
		private boolean ice;

		BuilderO(double waterCups, double coffeeCups) {
			this.waterCups = waterCups;
			this.coffeeCups = coffeeCups;
		}

		 public BuilderO addFoamedMilk(int millilitres) {
	         this.foamedMilk = millilitres;
	         return this;
	     }
		 
		 BuilderO addIce() {
			 this.ice = true;
	         return this;
	     }
		 
		 Coffee build() {
			 Coffee coffee = new Coffee();
			 coffee.setWaterCups(this.waterCups);
			 coffee.setCoffeeCups(this.coffeeCups);
			 coffee.setFoamedMilk(this.foamedMilk);
			 coffee.setIce(this.ice);
			 return coffee;
		 }
	}

	


}
