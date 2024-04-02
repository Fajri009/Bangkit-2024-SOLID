package OOP.Inheritance

// Di mana SubClass dapat mewarisi SuperClass yang di mana merupakan sebuah SubClass dari SuperClass lain
open class Carnivore: Animal(){
    fun eat(){
        println("${javaClass.simpleName} eat!")
    }
}

class Cat: Carnivore()