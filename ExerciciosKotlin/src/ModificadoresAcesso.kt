
/* 
private => visivel apenas de ntr oda classe
protected => Funciona como o "private" mans visivel em subclasses
public => visivel em todo lugar , caos noa seja definid e o padrão
internal => lembra o public , mas sua visibilidade e restringida ao modulo, 
sendo então visivel dentro um mesmo modulo 
*/



open class Animal {
    //private. protected, public
     var nome = "Frodo"

    fun dormir(){
        println("Dormir")
    }
}

class Cao: Animal() {
    fun exibeNome(){
        println("Metodo exibe nome: $nome")
    }

}



fun main(args: Array<String>) {

     val animal = Animal()
     println(animal.nome)
}