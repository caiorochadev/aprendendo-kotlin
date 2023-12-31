package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(size = 3)

    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    for (salario in salarios){ println(salario)}
    println("--")
    salarios.forEach { println(it) }
    println("--")
    salarios.sort()
    for (salario in salarios){ println(salario)}

    salarios.forEachIndexed{ index, salario -> salarios[index] = salario * 1.1}
    salarios.forEach { println(it) }


    val salarios2 = doubleArrayOf(1500.0 , 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
    println("----")
    salarios2.forEachIndexed { index, salario2 -> salarios2[index] = salario2 * 1.1}
    salarios.forEach { println(it) }


    }
