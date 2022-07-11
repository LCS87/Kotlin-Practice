fun main(args: Array<String>) {

    var rect = Rectangle()
    rect.length = 5
    rect.breadth = 3

    print("O Comprimento do retângulo é ${rect.length} e a Largura é ${rect.breadth}. A Area é ${rect.length * rect.breadth}")

}

class Rectangle {

    var length: Int = 0
    var breadth: Int = 0
}