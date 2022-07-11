fun main(args: Array<String>) {

    val a = 2

    val b = 5

    var maxValue: Int = if (a > b) {
                            print("a é Maior")
                            a
                        } else {
                            print("b é Maior")
                            b
                        }

    println(maxValue)
}