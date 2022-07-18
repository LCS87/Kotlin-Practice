class Person {
    var name: String = "Sriyank Siddhartha"
    var age: Int = 26
}

fun main() {

    /** Scope Function: 'with'
        Propriedade 1: consulte o objeto de contexto usando 'this'
         Propriedade 2: O valor de retorno é o 'resultado lambda'  */

    val person = Person()

    val bio: String = with(person) {
        println(name)
        println(age)
        age + 5
        "He is a freak who loves to teach in his own way" // será retornado e armazenado na variável String 'bio'
    }

//    println("A idade após cinco anos é $ageAfterFiveYears")
    println(bio)
}