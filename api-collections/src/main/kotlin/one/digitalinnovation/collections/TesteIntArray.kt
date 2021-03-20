package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    //iteração usando o for
    for (valor in values){
        println(valor)
    }
    println("--------------------")
    //iteração do kotlin, onde é possível fazer uso do it
    values.forEach { valor ->
        println(valor)
    }
    println("--------------------")
    //iteração para imprimir os indices do array
    for(index in values.indices){
        println(values[index])
    }
    println("--------------------")
    //iteração com os valores organizados
    //values.sortDescending()
    values.sort()
    for (valor in values){
        println(valor)
    }
}