package ro.ubb.dezsi.imola.lab1.ex1Encapsulation.main;

public class Coffee {

	@Override
	public String toString() {
		return "Coffee [quantity=" + quantity + ", unit=" + unit + ", ingredient=" + ingredient + ", adjective="
				+ adjective + "]\n";
	}
	private double quantity;
	private int unit;
	private String ingredient;
	private String adjective;
	
	
	public Coffee(double quantity, int unit, String ingredient, String adjective) {
		this.quantity = quantity;
		this.unit = unit;
		this.ingredient = ingredient;
		this.adjective = adjective;
	}
	
	public double getQuantity() {
		return quantity;
	}
	public int getUnit() {
		return unit;
	}
	public String getIngredient() {
		return ingredient;
	}
	public String getAdjective() {
		return adjective == null ? "no adjective" : adjective;
	}
}
