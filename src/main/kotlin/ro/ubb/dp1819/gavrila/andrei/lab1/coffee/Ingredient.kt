package ro.ubb.dp1819.gavrila.andrei.lab1.coffee

data class Ingredient(
        val quantity: Double,
        val unit: String,
        val name: String,
        val adjective: String? = null
)