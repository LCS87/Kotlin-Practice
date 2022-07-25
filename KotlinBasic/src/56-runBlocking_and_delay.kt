import kotlinx.coroutines.*


fun main() = runBlocking {        //Executa na thread principal
        println("Main program starts: ${Thread.currentThread().name}")  // thread principal

        GlobalScope.launch {    // Thread: T1
            println("Fake work starts: ${Thread.currentThread().name}")     // Thread: T1
            delay(1000)   // Coroutine está suspensa mas Thread: T1 está livre (não bloqueado)
            println("Fake work finished: ${Thread.currentThread().name}") // Ou T1 ou algum outro segmento.
        }

        delay(2000)  // thread principal: espere a corrotina terminar (praticamente não é a maneira correta de esperar)

        println("Main program ends: ${Thread.currentThread().name}")   // thread principal
}