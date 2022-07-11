class Casa{

 //propriedades   
  var cor: String = ""
  

//metodos
fun abrirJanela(qtdJanelas: Int){
    println("Abrir Janela total:  $qtdJanelas")
}

fun abrirPorta(){
    println("Abrir Porta")
}

fun abrirCasa(){   //"this" é usado para acessar atributo ou metosdos dentro da propria classe
    this.abrirPorta
    //this.abrirJanela
   
}




}

fun main(args: Array<String>) {


    val casa = casa()
    casa.cor = "amarela"
    casa.abrirJanela(10)

    /* 
    val casa2 = casa()
    casa2.cor = "vermelha"
    */

    println(casa.cor)
   // println(casa2.cor)

}