/*é umacontrato que quando assumido por umaclasse dev ser implementado */


interface Presidente{

    fun ganharEleicao() 
}

interface Pai{

    fun temFilho() 
}

open class Cidadao{
    fun direitosDeveres(){
        println("Todo cidadao tem direitos e deveres!")
    }

}


class Obama: Cidadao(),Presidente , Pai{
    override fun ganharEleicao(){
        println("Ganhar Eleiçaõ nos EUA")
    }
    override fun temFilho(){
        println("Tem Filho")
    }
}

class Samuel: Cidadao() , Presidente{
    override fun ganharEleicao(){
        println("Ganhar Eleiçaõ no Brasil")
    }

}




fun main(args: Array<String>) {

     val samuel = Samuel()
     samuel.direitosDeveres()

     val obama = Obama()
     obama.direitosDeveres()
     obama.ganharEleicao()
     obama.temFilho()

}