package one.digitalinnovation.collections

fun main(){
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Alberto"
    nomes[2] = "José"

    nomes.sort()
    for (nome in nomes){
        println(nome)
    }


    val nomes2 = arrayOf("Maria", "Camila", "Pedro")
    println("--------------------")
    nomes2.forEach { nome ->
        println(nome)
    }
}