/*
*   Abstract Class
* */
fun main(args: Array<String>) {

    //    var person = MyPerson()   /// Não permitido. Você não pode criar instância de classe abstrata
    
        var person = Indian()       
        // Permitido. Variável de referência de superclasse abstrata
        // apontando para o objeto da classe filho.
        person.name = "Steve"
        person.eat()
        person.goToSchool()
    }
    
    abstract class MyPerson {     // Você não pode criar instância de classe abstrata
    
        abstract var name: String
    
        abstract fun eat()      // propriedades abstratas são 'abertas' por padrão
    
        open fun getHeight() {} // Uma função 'aberta' pronta para ser substituída
    
        fun goToSchool() {}     // Funcão Normal
    }
    
    class Indian: MyPerson() {
    
        override var name: String = "dummy_indian_name"
    
        override fun eat() {
            // Our own code
        }
    }