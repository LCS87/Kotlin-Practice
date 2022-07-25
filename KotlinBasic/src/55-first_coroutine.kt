import kotlinx.coroutines.*


fun main() {      //Executa na thread principal

    println("Main program starts: ${Thread.currentThread().name}")

    GlobalScope.launch {    // cria uma corrotina em segundo plano que é executada em um thread em segundo plano
        println("Fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(1000)      // Finge estar fazendo algum trabalho... pode ser upload de arquivo
        println("Fake work finished: ${Thread.currentThread().name}")
    }

    // Bloqueia a thread principal atual e espera que a corrotina termine (praticamente não é a maneira correta de esperar)
    Thread.sleep(2000)
    println("Main program ends: ${Thread.currentThread().name}")
}