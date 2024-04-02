package OOP.Polymorphism

// Sebuah proses di mana sebuah method atau fungsi dipanggil saat kompilasi
open class Arithmetic {
    // Method Overloading
    // Kondisi di mana kita bisa membuat 2 (dua) atau lebih fungsi yang memiliki jumlah, tipe, atau urutan parameter yang berbeda di dalam sebuah class
    open fun add(valueA: Int, valueB: Int) = valueA + valueB
    open fun add(valueA: Long, valueB: Long) = valueA + valueB
    open fun add(valueA: Int, valueB: Long) = valueA + valueB
    open fun add(valueA: Long, valueB: Int) = valueA + valueB
}

class Add: Arithmetic() {
    override fun add(valueA: Int, valueB: Int): Int {
        println("Calculate!")
        return super.add(valueA, valueB)
    }
}