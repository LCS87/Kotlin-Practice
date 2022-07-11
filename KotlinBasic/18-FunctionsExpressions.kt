un main(args: Array<String>) {

    var largeValue = max(4, 6)

    println("O Maior valor é  $largeValue")
}

fun max(a: Int, b: Int): Int
                    = if (a > b) {
                        println("$a È Maior")
                        a
                    } else {
                        println("$b É Maior")
                        b
                    }