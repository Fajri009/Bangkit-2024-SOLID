package OOP.Inheritance

open class Animal {
    open fun walk() {
        println("${javaClass.simpleName} walk!")
    }
}