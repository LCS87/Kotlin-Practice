import kotlinx.coroutines.*

fun main() = runBlocking {    // Cria uma corrotina de bloqueio que executa na thread atual (main)

    println("Main program starts: ${Thread.currentThread().name}")  // main thread

    val job: Job = launch(Dispatchers.Default) {     // Thread T1: Cria uma corrotina sem bloqueio
        for (i in 0..500) {
            if (!isActive) {
                return@launch // parar
            }
            print("$i.")
            Thread.sleep(1)
        }
    }

    delay(10)  // Vamos imprimir alguns valores antes de cancelar
    job.cancelAndJoin()

    println("\nMain program ends: ${Thread.currentThread().name}")    // thread principal
}