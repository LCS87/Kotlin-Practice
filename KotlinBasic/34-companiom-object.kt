fun main(args: Array<String>) {

    MyClass.count           // Você pode imprimi-lo e verificar o resultado

    MyClass.typeOfCustomers()
}

class MyClass {

    companion object {

        var count: Int = -1             // Comporta-se como variável STATIC

        @JvmStatic
        fun typeOfCustomers(): String { // Comporta-se como o método STATIC
            return "Indian"
        }
    }
}