/*A definição para as notações infixas é: Uma notação comum em aritmética e na lógica, onde os operadores são colocados entre os operandos em que eles atuam.

Prefix: + 4 4
Postfix: 3 3 +
Infix: 8 + 8

Define uma extensão para Int usando uma função com notação infixa

------------------------------------------


infix fun Int.soma(valor: Int): Int{
	return this + valor
}

Agora sim chamamos a função usando a notação infixa
1 soma 2

Que é o equivalente a
1.soma(2)

-----------------------------------------

Concatenação simples de strings 
infix fun concat(outra: Int): String{
	return this + " " + outra
}

Chamada usando notação infixa
val exemplo = "Codigo" concat "Fonte"

*/





fun main(args: Array<String>) {

    val x: Int = 6
    val y: Int = 10

    val greaterVal = x findGreaterValue y   // x.findGreaterValue(y)

    println(greaterVal)
}

infix fun Int.findGreaterValue(other: Int): Int {       // INFIX and Extension Func

    if (this > other)
        return this
    else
        return other
}