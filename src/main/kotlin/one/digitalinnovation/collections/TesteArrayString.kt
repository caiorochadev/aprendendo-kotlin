package one.digitalinnovation.collections

fun main() {
    val nomes = Array(size = 3){""}

    nomes[0] = "Caio"
    nomes[1] = "Adriele"
    nomes[2] = "Apolo"

    println("--For nomes--")
    for (nome in nomes){ println(nome)}

    println("--ForEach nomes--")
    nomes.sort()
    nomes.forEach { println (it) }

    val nomes2 = arrayOf("Caio", "Adriele", "Apolo")

    println("--For nomes2--")
    for (nome in nomes2){ println(nome)}

    println("--ForEach nomes2--")
    nomes2.sort()
    nomes2.forEach { println (it) }


}