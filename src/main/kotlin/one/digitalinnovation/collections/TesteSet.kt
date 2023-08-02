package one.digitalinnovation.collections

fun main() {
    val caio = Funcionario(nome = "caio", salario = 2000.0, tipoContratacao = "CLT")
    val vinicius = Funcionario(nome = "vinicius", salario = 1500.0, tipoContratacao = "PJ")
    val florencio = Funcionario(nome = "florencio", salario = 4000.0, tipoContratacao = "CLT")

    val funcionarios1 = setOf(caio, vinicius)
    val funcionarios2 = setOf(florencio)
    val funcionarios3 = setOf(caio, vinicius, florencio)

    println("union")
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it) }

    println("setsubtract")
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println(it) }

    println("setInterset")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{ println(it) }

}
