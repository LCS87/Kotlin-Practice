import kotlinx.coroutines.*

fun main() = runBlocking {    // Cria uma corrotina de bloqueio que executa na thread atual (main)

    println("Main program starts: ${Thread.currentThread().name}")  // thread principal

    val result: String? = withTimeoutOrNull(2000) {
        for (i in 0..500) {
            print("$i.")
            delay(500)
        }

        "I am done"
    }

    print("Result: $result")

    println("\nMain program ends: ${Thread.currentThread().name}")    // thread principal
}