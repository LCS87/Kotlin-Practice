import kotlinx.coroutines.*

fun main() = runBlocking {

    // this: instância CoroutineScope
     // coroutineContext: instância CoroutineContext

     /* Sem Parâmetro: CONFINADO [DEMISSOR CONFINADO]
         - Herda CoroutineContext da corrotina pai imediata.
         - Mesmo após delay() ou função de suspensão, ele continua a ser executado no mesmo thread. */
    launch {
        println("C1: ${Thread.currentThread().name}")       // Thread: main
        delay(1000)
        println("C1 after delay: ${Thread.currentThread().name}")   // Thread: main
    }

    /* Com parâmetro: Dispatchers.Default [semelhante a GlobalScope.launch { } ]
         - Obtém seu próprio contexto em nível global. Executa em um thread em segundo plano separado.
         - Após delay() ou suspensão da execução da função,
             ele continua a ser executado no mesmo thread ou em algum outro thread. */
    launch(Dispatchers.Default) {
        println("C2: ${Thread.currentThread().name}")   // Thread: T1
        delay(1000)
        println("C2 after delay: ${Thread.currentThread().name}")   // Thread: Ou T1 ou algum outro thread
    }

   /* Com parâmetro: Dispatchers.Unconfined [UNCONFINED EXPEDIDOR]
         - Herda CoroutineContext da corrotina pai imediata.
         - Após delay() ou suspensão da execução da função, ela continua a ser executada em alguma outra thread. */
    launch(Dispatchers.Unconfined) {
        println("C3: ${Thread.currentThread().name}")   // Tópico: principal
        delay(1000)
        println("C3 after delay: ${Thread.currentThread().name}")  // Thread: algum outro thread T1
    }

    launch(coroutineContext) {
        println("C4: ${Thread.currentThread().name}")       // Tópico: principal
        delay(1000)
        println("C4 after delay: ${Thread.currentThread().name}")   // Tópico: principal 
    }

    println("...Main Program...")
}