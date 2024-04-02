package OOP.Inheritance

// Sebuah SuperClass yang diwarisi oleh beberapa SubClass
open class Herbivore: Animal(){
    fun eat(){
        println("${javaClass.simpleName} eat!")
    }
}

class Horse: Herbivore()

class Rabbit: Herbivore()

class Zebra: Herbivore()