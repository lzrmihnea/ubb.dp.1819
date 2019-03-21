package ro.ubb.dp1819.gavrila.andrei.lab1.service

import ro.ubb.dp1819.gavrila.andrei.lab1.coffee.Ingredient

class IngredientParserService {

    private fun readIngredient(line: String): Ingredient {
        val parts = line.split(" ")
        return Ingredient(parts[0].toDouble(), parts[1], parts[2], if (parts.size == 4) parts[3] else null)
    }

    fun readIngredients(lines: List<String>) = lines.map(this::readIngredient)

}