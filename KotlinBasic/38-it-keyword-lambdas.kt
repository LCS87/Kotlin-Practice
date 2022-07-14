fun main(args: Array<String>) {

    val program = Programs()
    program.reverseAndDisplay("hello", { it.reversed() })
}

class Programs {

    fun reverseAndDisplay(str: String, myFunc: (String) -> String) {  // Função de alto nível com Lambda como parâmetro

        val result = myFunc(str)    // it.reversed() ==> str.reversed() ==> "hello".reversed() = "olleh"
        println(result)
    }
}