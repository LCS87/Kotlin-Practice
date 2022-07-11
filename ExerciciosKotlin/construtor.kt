
                   //construtor Primario
class Casa (cor: String, vagasGaragem:Int)   {

    //propriedades   
     var cor: String 
     var vagasGaragem: Int 


     //usado para inicilaizar os dados que se deseja
     /*Int{
        this.cor = $cor
        this.vagasGaragem = vagasGaragem
     }*/
   
      construtor(cor: String, vagasGaragem: Int){ //cosntrutor secundario
        this.cor = cor
        this.vagasGaragem = vagasGaragem
      }



   //metodos
   fun detalhesCasa(){
       println("A Casa tem a cor: $cor, vagas: $vagasGaragem")
   }
   
   
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
   
   
       val casa = casa("amarela",2)
       casa.detalhesCasa()
   
   }