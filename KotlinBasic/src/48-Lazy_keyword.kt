val pi: Float by lazy {
    3.14f
}

fun main(args: Array<String>) {

    println("Some initial code.....")

    // pi ainda não foi inicializado

    val area1 = pi * 4 * 4      // pi é inicializado e atribuído o valor de 3.14f pela primeira vez

    val area2 = pi * 9 * 9      // O valor pi é carregado da memória cache

    println("Some more code....")
}


// 'lazy initialization' foi projetado para evitar inicialização desnecessária de objetos.
// Suas variáveis não serão inicializadas a menos que você as use em seu código
// É inicializado apenas uma vez. Na próxima vez que você usá-lo, você obterá o valor da memória cache.

// É thread-safe
// É inicializado na thread onde é usado pela primeira vez.
// Outros threads usam o mesmo valor armazenado no cache

// A variável pode ser var ou val.
// A variável pode ser anulável ou não anulável