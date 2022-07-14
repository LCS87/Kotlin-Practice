fun main(args: Array<String>) {

    var person = Perrson()

    with(person) {
        name = "Frodo"
        age = 23
    }

    person.apply {
        name = "Frodo"
        age = 23
    }.startRun()

    println(person.name)
    println(person.age)
}

class Perrson {

    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("Agora estou pronto pra correr")
    }
}