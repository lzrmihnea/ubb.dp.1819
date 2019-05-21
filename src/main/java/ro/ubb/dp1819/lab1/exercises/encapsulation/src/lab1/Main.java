package lab1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ReadingService readingService = new ReadingService("D:\\ubb\\A3S2\\Design Patterns\\Lab1\\encapsulation\\src\\lab1\\ingredients.txt");
	    ExecutingService executingService = new ExecutingService();
	    List<Coffee> coffees = executingService.makeCoffees(readingService.readIngredients());
	    printCoffees(coffees);
    }

    private static void printCoffees(List<Coffee> coffees){
        for(Coffee c: coffees)
            System.out.println(c);
    }
}
