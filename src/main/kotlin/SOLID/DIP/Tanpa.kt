package SOLID.DIP

fun main() {
    val car = Car(Engine())
    car.start()

//    val dieselCar = Car(DieselEngine())
    /*
    Type mismatch.
    Required: Engine
    Found: DieselEngine
     */
}

class Car(private val engine: Engine) {
    fun start() {
        engine.start()
    }
}

class Engine {
    fun start() {}
}

class DieselEngine {
    fun start() {}
}