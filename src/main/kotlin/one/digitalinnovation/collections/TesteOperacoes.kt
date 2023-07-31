package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0 , 2250.0 , 4000.0, 6000.0)



    for (salario in salarios){ println(salario)}
    println("---")

    println("Maior salario ${salarios.max()}")
    println("Menor salario ${salarios.min()}")
    println("Salario medio ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500 }
    println("---")
    salariosMaiorQue2500.forEach { println(it) }

    println("uso do count")
    println(salarios.count {it in 1000.0 .. 5000.0})
    println("uso do find")
    println(salarios.find {it == 2250.0 })
    println("uso do any")
    println(salarios.any {it == 1000.0 })



}