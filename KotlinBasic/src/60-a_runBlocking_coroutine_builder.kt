import kotlinx.coroutines.*


fun main() = runBlocking {    // Cria uma corrotina de bloqueio que executa na thread atual (main)

    println("Main program starts: ${Thread.currentThread().name}")  // thread principal

    val deferredJob: Deferred<Unit> = async   // Tópico: principal
        println("Fake work starts: ${Thread.currentThread().name}")     // Tópico: principal
        delay(1000)   // Coroutine está suspensa, mas Thread: main está livre (não bloqueado)
        println("Fake work finished: ${Thread.currentThread().name}") // Tópico: principal
        15
    }

    val num: Int = deferredJob.await()  // thread principal: espera que a corrotina termine e retorne os dados 

    println("Main program ends: ${Thread.currentThread().name}")    // thread principal
}

suspend fun myOwnSuspendingFunc() {
    delay(1000)     // faça alguma coisa
}