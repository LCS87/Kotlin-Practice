interface ICardCashBack {
    fun getCashbackValue(): Float
}

enum class CreditCardType(val color: String, val maxLimit: Int = 1000000): ICardCashBack {
    SILVER("gray", 50000) {
        override fun getCashbackValue(): Float = 0.02f
    },
    GOLD("gold"){
        override fun getCashbackValue(): Float = 0.04f
    },
    PLATINUM("black"){
        override fun getCashbackValue(): Float = 0.06f
    }
}


fun main() {

    // Propriedades e métodos de acesso 
    println(CreditCardType.SILVER.color)    // gray
    println(CreditCardType.SILVER.getCashbackValue())   // 0.02

    // Constantes enum são objetos do tipo de classe enum. 
    val peterCardType: CreditCardType = CreditCardType.GOLD

    // Cada objeto enum tem duas propriedades: ordinal e name 
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD)    // OR CreditCardType.GOLD.name

    // Cada objeto enum tem dois métodos: values() e valueOf()
    val myConstants: Array<CreditCardType> = CreditCardType.values()
    myConstants.forEach { println(it) }

    // Usando na declaração 'When'
    when(peterCardType) {
        CreditCardType.SILVER -> println("Peter has silver card")
        CreditCardType.GOLD -> println("Peter has gold card")
        CreditCardType.PLATINUM -> println("Peter has platinum card")
    }
}