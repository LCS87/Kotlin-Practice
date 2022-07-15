fun main(args: Array<String>) {

    val x = 100

    val str: String  = when (x) {

        1 -> "x é 1"
        2 -> "x é 2"
        else -> {
            "x Valor desconhecido"
            "x é um Ogro"
        }
    }

    println(str)
}
