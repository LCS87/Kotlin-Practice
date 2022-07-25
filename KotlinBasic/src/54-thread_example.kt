import kotlin.concurrent.thread

fun main() {        //Executa na thread principal

    println("Main program starts: ${Thread.currentThread().name}")

    thread {    // cria um thread em segundo plano (thread de trabalho)
        println("Fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(1000)      // Finge estar fazendo algum trabalho... pode ser upload de arquivo
        println("Fake work finished: ${Thread.currentThread().name}")
    }

    println("Main program ends: ${Thread.currentThread().name}")
}