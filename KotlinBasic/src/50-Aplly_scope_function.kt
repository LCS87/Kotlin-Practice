class Person {
    var name: String = ""
    var age: Int = 0
}

fun main() {

    /** Scope Function: 'apply'
    Propriedade 1: consulte o objeto de contexto usando 'this'
     Propriedade 2: O valor de retorno é o 'objeto de contexto'  */

    val person = Person().apply {
        name = "Sriyank Siddhartha"
        age = 26
    }

    with(person) {
        println(name)       // prints   Sriyank Siddhartha
        println(age)        // prints   26 
    }

    // Execute algumas outras operações no objeto 'pessoa'
    person.also {
        it.name = "Shreks de Smarther"
        println("Novo Nome: ${it.name}")     // imprime Novo nome: Shreks do Smartherd
    }
}