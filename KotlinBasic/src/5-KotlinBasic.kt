fun main(args: Array<String>) {

    var personObj = Person()
    personObj.name = "Frodo"

    print("O nome do personagem é  ${personObj.name}")
}

class Person {

    var name: String = ""
}