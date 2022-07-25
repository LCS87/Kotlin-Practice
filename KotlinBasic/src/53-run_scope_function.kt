class Person {
    var name: String = "Sriyank Siddhartha"
    var age: Int = 26
}

fun main() {

    /** Função de escopo: 'executar'
     Propriedade 1: consulte o objeto de contexto usando 'this'
     Propriedade 2: O valor de retorno é o 'resultado lambda' */

     // 'run' é a combinação de 'with' e 'let'
     // Se você deseja operar em um objeto Nullable e evitar NullPointerException, use 'run'

    val person: Person? = Person()

    val bio = person?.run {
        println(name)
        println(age)
        age + 5
        "He is a freak who loves to teach in his own way"   // será retornado e armazenado na variável 'bio'
    }

    println(bio)
}