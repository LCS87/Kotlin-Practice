fun main(args: Array<String>) {

/* 
    opcao = 1

    when(opcao){
     1 -> {
           println("Café com leite")
        }
    2 -> println("Energetico")

          else -> println("Nenhuma opção selecionada")
    }
  */


    var opcao = 1
    var resultado = when (opcao){
        1 -> "Café Puro"
        2 -> "Chocolate quente"
        else -> "Nenhuma opçaõ selecionada"
    }
    println(resultado)
}
