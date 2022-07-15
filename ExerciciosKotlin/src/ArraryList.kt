/* collections ou coleçoes -> implementação d estrutura de dados
- List => Imutavel, Tamanho fixo, apenas leitura
- ArrayList => Mutavel, sem tamanho fixo, pode adcionar ou remover
*/


fun main(args: Array<String>) {

    var listaItens = arrayListOf("AL","PB","MG")
    listaItens.add("BA")
    listaItens.remove("PB")
    //listaItens.removeAt(0)
    println(listaItens)
    //println(listaItens.size)  contar os itens
   // println(listaItens.isEmpty) verificar de a lista esta vazia