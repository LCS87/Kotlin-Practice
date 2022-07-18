/** FILTER
 * Retorna uma lista contendo apenas elementos que correspondem ao [predicado] fornecido
 * */

/** MAP
 * Retorna uma lista contendo os resultados da aplicação da função [transform] fornecida
  * a cada elemento da coleção original
 * */

fun main(args: Array<String>) {

    val myNumbers: List<Int> = listOf(2, 3, 4, 6, 23, 90)

    val mySmallNums = myNumbers.filter { it < 10 }    // OR { num -> num < 10 }
    for (num in mySmallNums) {
        println(num)
    }

    val mySquaredNums = myNumbers.map { it * it }     // OR { num -> num * num }
    for (num in mySquaredNums) {
        println(num)
    }

    var people = listOf<Pperson>(Pperson(10, "Steve"), Pperson(23, "Annie"), Pperson(17, "Sam"))
    var names = people.filter { person ->person.name.startsWith("S") }.map { it.name }

    for (name in names) {
        println(name)
    }
}

class Pperson(var age: Int, var name: String) {
    // Algum outro código..
}