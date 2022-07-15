fun main(args: Array<String>) {

    val program = MyProgram()

//    val myLambda: (Int, Int) -> Int = { x, y -> x + y}  // Expressão Lambda  [ Function ]
// OR,
//    program.addTwoNumbers(2, 7, { x, y -> x + y })
// OR,
    program.addTwoNumbers(2, 7) {x, y -> x + y}
}

class MyProgram {

    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Int) {  // Função de alto nível com Lambda como parâmetro

        val result = action(a, b)
        println(result)
    }
}
