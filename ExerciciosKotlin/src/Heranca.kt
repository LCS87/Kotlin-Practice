
// "open class" cria a relação de Herança
open class Animal{  
    //colocando open os metodos podem ser sobre escritos
    open fun dormir(){
        println("Dormir")
    }

    fun correr(){
        println("Correr")
    }
}



class Cao : Animal() {
    //sobre escreve o metodo pai
    override fun dormir(){
        super.dormir()  //chamando a implementação da classe pai
        println("como um cão")
    }
    
    fun latir(){
        println("Latir")
    }


}



class Passaro : Animal(){

}


fun main(args: Array<String>){

val cao = Cao()
cao.dormir()
cao.correr()
cao.latir()

val passaro = Passaro()
passaro.dormir()

}