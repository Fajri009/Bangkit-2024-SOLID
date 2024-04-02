package OOP.Inheritance

// Class yang dibuat hanya mewarisi satu class
class Single : Animal() {
    override fun walk() {
        println("Yeay! ${javaClass.simpleName} walked!")
    }
}