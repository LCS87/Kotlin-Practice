fun main(args: Array<String>) {

    val country = Country()

//    country.name = "India"
//    println(country.name)

    country.setup()
}

class Country {

    lateinit var name: String

    fun setup() {
        name = "USA"
        println("O nome do país é $name")
    }
}

// lateinit usado apenas com tipo de dados mutável [ var ]
// lateinit usado apenas com tipo de dados não anulável
// os valores lateinit devem ser inicializados antes de serem usados

// Se você tentar acessar a variável lateinit sem inicializá-la, ela lançará UninitializedPropertyAccessException