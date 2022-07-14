

// As limitações da classe Enum são superadas pela classe selada.
enum class Color(val colorShade: String) {
    RED("light red"),
    GREEN("light green"),         // Esses valores codificados não podem ser alterados. São constantes.
    // BLUE(val myBlueColorShade: String)  // valores de variáveis não são permitidos em enum
}

sealed class Shape {
    data class Circle(var radius: Float): Shape()   // subclasse pode ser uma classe de dados
    class Square(var side: Int): Shape()            // subclasse pode ser uma classe regular 

    object NotAShape : Shape()      // subclasse pode ser um objeto (singleton)

    // classe selada Linha : Shape()    // subclasse pode ser outra classe selada
    // Interface selada Desenhar           // subclasse pode ser uma interface
}

// Você pode definir qualquer tipo de subclasse fora da classe selada também
class Rectangle(var length: Int, var breadth: Int): Shape()


fun main() {

    var circle = Shape.Circle(3.0f)
    var square = Shape.Square(8)
    var rectangle = Rectangle(20,10)    // Ligeiramente diferente do que acima de dois

    val noShape = Shape.NotAShape 

    checkShape(noShape)
}

fun checkShape(shape: Shape) {

    when (shape) {
        is Shape.Circle -> println("Circle area is ${3.14 * shape.radius * shape.radius}")
        is Shape.Square -> println("Square area is ${shape.side * shape.side}")
        is Rectangle -> println("Rectagle area is ${shape.length * shape.breadth}")
        Shape.NotAShape -> println("No shape found")  // 'is' não é necessário para o objeto (singleton)
        //  else -> "else case não é necessário, pois todos os casos são cobertos acima"
    }
}