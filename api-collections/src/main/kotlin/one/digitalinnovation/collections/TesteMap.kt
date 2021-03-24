package one.digitalinnovation.collections

//Mutable Map
fun main(){
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach{ (k, v) -> println("Chaves: $k - Valor: $v")}

    // to -> recurso do kotlin infix
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )

    map2.forEach{(k,v)-> println("Chave: $k - Valor: $v")}

    val abc: Pair<String, Double>

}