package ro.ubb.dp1819.gavrila.andrei.lab1.factory

import ro.ubb.dp1819.gavrila.andrei.lab1.coffee.*

class CoffeeFactory {

    private val coffeeRecipes = hashMapOf<Set<Ingredient>, () -> Coffee>()
    private val unknownCoffeeRecipe = { UnknownCoffee() }

    init {
        registerCoffee(
                Espresso::class.java,
                Ingredient(2.0, "cups", "water"),
                Ingredient(0.25, "cups", "coffee-beans", "roasted")
        )
        registerCoffee(
                Cappuccino::class.java,
                Ingredient(2.0, "cups", "water"),
                Ingredient(0.25, "cups", "coffee-beans", "roasted"),
                Ingredient(100.0, "ml", "milk", "foamed")
        )
        registerCoffee(
                Americano::class.java,
                Ingredient(4.0, "cups", "water"),
                Ingredient(0.25, "cups", "coffee-beans", "roasted")
        )
        registerCoffee(
                Latte::class.java,
                Ingredient(1.0, "cups", "water"),
                Ingredient(0.25, "cups", "coffee-beans", "roasted"),
                Ingredient(3.0, "cups", "milk", "foamed"),
                Ingredient(50.0, "g", "caramel")
        )
    }


    fun <T : Coffee> registerCoffee(recipe: Set<Ingredient>, coffeeClass: Class<T>) {
        coffeeRecipes[recipe] = { coffeeClass.getConstructor().newInstance() }
    }

    fun <T : Coffee> registerCoffee(coffeeClass: Class<T>, vararg ingredients: Ingredient) {
        registerCoffee(ingredients.toSet(), coffeeClass)
    }


    fun makeCoffee(ingredients: List<Ingredient>): Coffee {
        val recipe = coffeeRecipes.getOrDefault(ingredients.toSet(), unknownCoffeeRecipe)

        return recipe()
    }

}