fun main(args: Array<String>) {

    var student = Studentt()
    println("Pass status: " + student.hasPassed(57))

    println("Bolsa de Estudos: " + student.isScholar(57))
}

fun Studentt.isScholar(marks: Int): Boolean {
    return marks > 95
}

class Studentt {         // OUR OWN CLASS

    fun hasPassed(marks: Int): Boolean {
        return marks > 40
    }
}