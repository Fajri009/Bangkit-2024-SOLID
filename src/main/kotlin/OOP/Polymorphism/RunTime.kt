package OOP.Polymorphism

// Proses di mana sebuah fungsi dipanggil pada saat runtime
// Method Overriding
// Sebuah kelas yang memiliki fungsi dengan nama sama dengan fungsi yang di dalam kelas induknya
fun main() {
    val cat = Cat()
    cat.walk()
}

open class Animal {
    open fun walk() {
        println("${javaClass.simpleName} walk!")
    }
}

class Cat : Animal() {
    override fun walk() {
        super.walk()
        println("Yeay! ${javaClass.simpleName} walked!")
    }
}