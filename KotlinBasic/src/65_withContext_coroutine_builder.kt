import kotlinx.coroutines.*

fun main() = runBlocking {    // Creates a blocking coroutine that executes in current thread (main)

    println("Main program starts: ${Thread.currentThread().name}")  // main thread

    val job: Job = launch(Dispatchers.Default) {     // Thread T1: Creates a non-blocking coroutine
        try {
            for (i in 0..500) {
                print("$i.")
                delay(5)    // ou use yield() ou qualquer outra função de suspensão conforme sua necessidade.
            }
        } catch (ex: CancellationException) {
            print("\nException caught safely: ${ex.message}")
        } finally {
            withContext(NonCancellable) {
                delay(1000)     // Geralmente não usamos a função de suspensão em finally
                print("\nClose resources in finally")
            }
        }
    }

    delay(10)  // Vamos imprimir alguns valores antes de cancelar
    job.cancel(CancellationException("My own crash message"))
    job.join()

    println("\nMain program ends: ${Thread.currentThread().name}")    // thread principal
}