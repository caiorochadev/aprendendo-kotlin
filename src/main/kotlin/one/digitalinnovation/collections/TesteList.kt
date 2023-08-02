package one.digitalinnovation.collections

fun main() {
    val caio = Funcionario(nome = "caio", salario = 2000.0, tipoContratacao = "CLT")
    val vinicius = Funcionario(nome = "vinicius", salario = 1500.0, tipoContratacao = "PJ")
    val florencio = Funcionario(nome = "florencio", salario = 4000.0, tipoContratacao = "CLT")

    val funcionarios = listOf(caio, vinicius, florencio)

    println("--todos os funcionarios--")
    funcionarios.forEach{ println(it) }

    println("--So o vinicius--")
    println(funcionarios.find { it.nome == "vinicius" })

    println("--salarios maior que mil")
    val salariosMaiorQueMil = funcionarios.filter { it.salario > 1000.0 }
    salariosMaiorQueMil.forEach{ println(it) }

    println("--utilizando sortedBy")
    funcionarios.sortedBy{ it.salario }.forEach{ println(it) }

    println("--utilizando groupby contratacao")
    funcionarios.groupBy{ it.tipoContratacao }.forEach{ println(it) }
}

