import kotlinx.coroutines.*

fun main() = runBlocking {   // Cria uma corrotina de bloqueio que executa na thread atual (main)

    println("Main program starts: ${Thread.currentThread().name}")  // thread principal

    val job: Job = launch {     // Thread main: Cria uma corrotina não bloqueante
        for (i in 0..500) {
            print("$i.")
            yield()    // ou use delay() ou qualquer outra função de suspensão conforme sua necessidade.
        }
    }

    delay(10)  // Vamos imprimir alguns valores antes de cancelar
    job.cancelAndJoin()

    println("\nMain program ends: ${Thread.currentThread().name}")    // thread principal
}