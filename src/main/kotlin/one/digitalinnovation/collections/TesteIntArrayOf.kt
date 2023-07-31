package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    println("-----FOR-----")
    for (valor in values){
        println(valor)
    }


    println("-----FOREACH-----")
    values.forEach { valor ->
        println(valor)
    }

    println("--FOR WITH INDEX--")
    for(index in values.indices){
        println(values[index])
    }

    println("--FOR WITH SORT--")
    values.sort()
    for(valor in values){
        println(valor)
    }
}