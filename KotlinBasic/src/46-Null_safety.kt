fun main(args: Array<String>) {

    // WAP para descobrir o comprimento do nome
    val name: String? = "Steve"     // mude para null e veja o efeito na saída

    // 1. Chamada Segura (Safe Call) ( ?. )
     // Retorna o comprimento se 'name' não for null senão retorna NULL
     // Use-o se você não se importar em obter o valor NULL
    println("The length of name is ${name?.length}")


    // 2. Chamada Segura com let ( ?.let )
     // Executa o bloco SOMENTE SE o nome NÃO for NULO
    name?.let {
        println("The length of name is ${name.length}")
    }


    // 3. Operador Elvis ( ?: )
     // Quando temos uma referência anulável 'name', podemos dizer "is name is not null", use-o,
     // caso contrário, use algum valor não nulo"
    val len = if (name != null)
        name.length
    else
        -1

    val length = name?.length ?: -1
    println("The length of name is ${length}")

    // 4. Operador de asserção não nulo ( !! )
     // Use-o quando tiver certeza de que o valor NÃO é NULL
     // Lança NullPointerException se o valor for NULL

    println("The length of name is ${name!!.length}")
}