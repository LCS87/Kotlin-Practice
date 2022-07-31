import kotlinx.coroutines.*

fun main() = runBlocking {    // Cria uma corrotina de bloqueio que executa na thread atual (main)

    println("Main program starts: ${Thread.currentThread().name}")  // main thread

    val job: Job = launch(Dispatchers.Default) {     // Thread T1: Cria uma corrotina não bloqueante
        try {
            for (i in 0..500) {
                print("$i.")
                delay(5)    // ou use yield() ou qualquer outra função de suspensão conforme sua necessidade.
            }
        } catch (ex: CancellationException) {
            print("\nException caught safely: ${ex.message}")
        } finally {
            print("\nClose resources in finally")
        }
    }

    delay(10)  // Vamos imprimir alguns valores antes de cancelar
    job.cancel(CancellationException("My own crash message"))
    job.join()

    println("\nMain program ends: ${Thread.currentThread().name}")    // thread principal
}