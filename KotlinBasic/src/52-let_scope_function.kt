fun main() {

    /** Função de escopo: 'let'
     Propriedade 1: consulte o objeto de contexto usando 'it'
     Propriedade 2: O valor de retorno é o 'resultado lambda' */

     // Use a função 'let' para evitar NullPointerException

    val name: String? = "Hello"

    // Executa a expressão lambda somente se a variável 'name' for NOT NULL
    val stringLength = name?.let {
        println(it.reversed())
        println(it.capitalize())
        it.length      // Será retornado e armazenado dentro da variável stringLength
    }

    println(stringLength)
}