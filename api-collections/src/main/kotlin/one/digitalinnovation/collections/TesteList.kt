package one.digitalinnovation.collections


fun main(){
    val joao = Funcionario(nome = "João", salario = 2000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{println(it)}

    println("--------------------")
    println(funcionarios.find{it.nome == "Maria"})

    println("--------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it)}          //neste caso o foreach tem a responsabilidade de finalizar todas as operações que foram atreladas

    println("--------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{ println(it)}

    //Na lista de API Collection não é possível adicionar elementos
}