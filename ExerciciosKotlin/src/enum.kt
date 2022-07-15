// Enum (enumeração) -> é um tipo de dados
//que consiste em um conjuntoo de constantes



enum class StatusPedido{

        PROCESSANDO, APROVADO, REPROVADO
}

class Pedido {

    var status: StatusPedido = StatusPedido.PROCESSANDO
}


fun main(args: Array<String>) {

 val pedido = Pedido()
 pedido.status

 if (pedido.status == StatusPedido.PROCESSANDO ){
    print("Pedido esta sendo Processado!")
 } else if (pedido.status == StatusPedido.APROVADO){
    println("Pedido foi Aporvado!")
 }

}
