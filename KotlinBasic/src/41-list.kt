fun main(args: Array<String>) {

    // Elements :
    // Index    :   0   1   2   3   4

//    var list = mutableListOf<String>()  // Mutavel, Sem tamanho fixo, Pode adcionar ou remover elementos
//    var list = arrayListOf<String>()    // Mutavel, Sem tamanho fixo, Pode adcionar ou remover elementos
    var list = ArrayList<String>()      //Mutavel, Sem tamanho fixo, Pode adcionar ou remover elementos
    list.add("Yogi")        // 0
    list.add("Manmohan")    // 1
    list.add("Vajpayee")    // 2

//    list.remove("Manmohan")
//    list.add("Vajpayee")

    list[1] = "Modi"

    for (element in list) {             // Usando elementos individuais (Objects)
        println(element)
    }
}