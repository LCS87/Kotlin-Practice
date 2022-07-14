fun main(args: Array<String>) {

    val program = Program()

    program.addTwoNumbers(2, 7)     // Maneira simples... para melhor compreensão

    program.addTwoNumbers(2, 7, object : MyInterface {   // Using Interface / OOPs way

        override fun execute(sum: Int) {
            println(sum)    // Body
        }
    })

    val test: String = "Hello"

    val myLambda: (Int) -> Unit = { s: Int -> println(s)}   // Expressão Lambda [Function]
    program.addTwoNumbers(2, 7, myLambda)
}

class Program {

    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) {  // Função de alto nível com Lambda como parâmetro

        val sum = a + b
        action(sum)     // println(sum)
//        println(sum)  // Body
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) {    // Usando Interface / Maneira Orientada a Objetos
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int) {                         // Maneira simples .. Apenas para melhor compreensão

        val sum =  a + b
        println(sum)
    }
}

interface MyInterface {
    fun execute(sum: Int)
}