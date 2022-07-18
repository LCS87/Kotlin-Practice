fun main(args: Array<String>) {

    // Map Tutorial: Key-Value pair
//    var myMap = HashMap<Int, String>()      // Mutable, READ e WRITE ambos, Sem tamanho fixo
//    var myMap = mutableMapOf<Int, String>() // Mutable, READ e WRITE ambos, Sem tamanho fixo
    var myMap = hashMapOf<Int, String>()      // Mutable, READ e WRITE ambos, Sem tamanho fixo

    myMap.put(4, "Yogi")
    myMap.put(43, "Manmohan")
    myMap.put(7, "Vajpayee")

    myMap.put(43, "Modi")

    for (key in myMap.keys) {
        println("Element at $key = ${myMap[key]}")  // myMap.get(key)
    }
}