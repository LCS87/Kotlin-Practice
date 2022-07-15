fun main(args: Array<String>) {

    CustomersData.count = 98
    CustomersData.typeOfCustomers()

    println(CustomersData.typeOfCustomers())

    CustomersData.count = 109
    println(CustomersData.count)

    CustomersData.myMethod("hello")
}

open class MySuperClass {

    open fun myMethod(str: String) {
        println("MySuperClass")
    }
}

object CustomersData: MySuperClass() {      // Objeto declarado

    var count: Int = -1             // Comporta-se como uma variável STATIC

    fun typeOfCustomers(): String { // Comporta-se como um método ESTÁTICO
        return "Indian"
    }

    override fun myMethod(str: String) {    // Atualmente, se comportando como um método STATIC
        super.myMethod(str)
        println("object Customer Data: $str")
    }
}