package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("caio", 1000.0)

    println("map1")
    val map1 = mapOf(pair)
    map1.forEach { (k, v) -> println("Chave: $k - valor $v") }

    println("map2")
    val map2 = mapOf(
        "vinicius" to 2000.0,
        "florencio" to 3000.0
    )
    map2.forEach { (k, v) -> println("Chave: $k - valor $v")}
}