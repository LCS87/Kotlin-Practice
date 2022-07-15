fun main(args: Array<String>) {

    val program = TheProgram()

    var result = 0

    program.addTwoNumbers(2, 7) {x, y -> result = x + y}

    println(result)
}

class TheProgram {

    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Unit) {  // Função de alto nível com Lambda como parâmetro

        action(a, b)
    }
}