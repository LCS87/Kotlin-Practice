import kotlinx.coroutines.*


fun main() = runBlocking {    // Cria uma corrotina de bloqueio que executa na thread atual (main)

    println("Main program starts: ${Thread.currentThread().name}") // thread principal

    val job: Job = launch {   // Tópico: principal
        println("Fake work starts: ${Thread.currentThread().name}")     // Tópico: principal
        delay(1000)   // Coroutine está suspensa, mas Thread: main está livre (não bloqueado)
        println("Fake work finished: ${Thread.currentThread().name}") // Tópico: principal
    }

    job.join()     // thread principal: espera que a corrotina termine

    println("Main program ends: ${Thread.currentThread().name}")    // Tópico: principal
}