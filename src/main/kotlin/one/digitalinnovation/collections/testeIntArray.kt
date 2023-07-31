package one.digitalinnovation.collections

fun main() {
    val values = IntArray(size = 5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

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