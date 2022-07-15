fun main(args: Array<String>) {

    var myButton = MyButton()
    myButton.onTouch()
    myButton.onClick()
}

interface MyInterfaceListener {     // Não pode criar instancia em interface

    fun onTouch()                   // Metodos em interface são abtratos por padrão

    fun onClick() {                 // Metodos são abertos e publicos por padrão mas no final
        println("MyInterfaceListener: onClick")
    }
}

interface MySecondInterface {       //  Não pode criar instancia em interface

    fun onTouch() {                 // Metodos normais
        println("MySecondInterface: onTouch")
    }

    fun onClick() {                  // Metodos são abertos e publicos por padrão mas no final
        println("MySecondInterface: onClick")
    }

}

class MyButton: MyInterfaceListener, MySecondInterface {

    override fun onTouch() {
        super<MyInterfaceListener>.onClick()
        super<MySecondInterface>.onClick()
    }

    override fun onClick() {
        super.onTouch()
    }
}