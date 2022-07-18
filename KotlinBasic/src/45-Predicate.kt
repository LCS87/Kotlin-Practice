fun main(args: Array<String>) {

    val myNumbers = listOf(2, 3, 4, 6, 23, 90)

    val myPredicate = { num: Int -> num > 10 }

    val check1 = myNumbers.all( myPredicate )       // Todos os elementos são maiores que 10?
    println(check1)

    val check2 = myNumbers.any(myPredicate)         // Algum desses elementos satisfaz o predicado?
    println(check2)

    val totalCount: Int = myNumbers.count(myPredicate) // Número de elementos que satisfazem o predicado.
    println(totalCount)

    val num = myNumbers.find(myPredicate)           // Retorna o primeiro número que corresponde ao predicado
    println(num)
}