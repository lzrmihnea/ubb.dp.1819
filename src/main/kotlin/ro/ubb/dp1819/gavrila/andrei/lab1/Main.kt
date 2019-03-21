package ro.ubb.dp1819.gavrila.andrei.lab1

import ro.ubb.dp1819.gavrila.andrei.lab1.factory.CoffeeFactory
import ro.ubb.dp1819.gavrila.andrei.lab1.service.FileReaderService
import ro.ubb.dp1819.gavrila.andrei.lab1.service.IngredientParserService
import java.io.File
import java.nio.file.Paths

fun main() {
    val rootDir = File({}.javaClass.getResource("/").toURI()).parent
    val coffeeFiles = Paths.get(rootDir, "resources", "gavrilaandrei").toFile().listFiles()

    val readerService = FileReaderService()
    val parserService = IngredientParserService()
    val coffeeFactory = CoffeeFactory()

    coffeeFiles.forEach {
        val ingredients = parserService.readIngredients(readerService.read(it))
        val coffee = coffeeFactory.makeCoffee(ingredients)
        println("${it.name} ${coffee.name()}")
    }
}
