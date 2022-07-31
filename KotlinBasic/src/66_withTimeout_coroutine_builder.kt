import kotlinx.coroutines.*

fun main() = runBlocking {    // Cria uma corrotina de bloqueio que executa na thread atual (main)

    println("Main program starts: ${Thread.currentThread().name}")  // main thread

    withTimeout(1300) {
        try {
            for (i in 0..1000) {
                print("$i.")
                delay(500)
            }
        } catch (ex: TimeoutCancellationException) {
            // .. code..
        } finally {
            // .. code..
        }
    }

    println("\nMain program ends: ${Thread.currentThread().name}")    // thread principal
}