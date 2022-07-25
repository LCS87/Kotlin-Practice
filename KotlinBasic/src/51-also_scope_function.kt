fun main() {

    /** Função de Escopo: 'also'             'TAMBÉM REALIZE A SEGUINTE OPERAÇÃO EXTRA'
    Propriedade 1: consulte o objeto de contexto usando 'it'
     Propriedade 2: O valor de retorno é o 'objeto de contexto' */

    // Initialise numbersList 
    val numbersList: MutableList<Int> = mutableListOf(1, 2, 3)

    // Algum outro código... pode ser uma chamada de função ou programa para trocar números (não importa qual código)

    // Operações na 'numbersList'
    val duplicateNumbers = numbersList.also {
        println("The list elements are: $it")
        it.add(4)
        println("The list elements after adding an element: $it")
        it.remove(2)
        println("The list elements after removing an element: $it")
    }

    //duplicateNumbers será igual a numberList
    println("Original numbers: $numbersList")
    println("Duplicate numbers: $duplicateNumbers")
}