package one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(1000.0,2250.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("--------------------")
    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Média salarias: ${salarios.average()}")

    // No filter é necessário passar um predicado, ou seja algo que vai nos dar uma expressão e sendo verdade, vai filtrando e alocando o resultado
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }

    println("--------------------")

    salariosMaiorQue2500.forEach{ println(it)}
}