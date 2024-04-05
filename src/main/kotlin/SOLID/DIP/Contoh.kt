package SOLID.DIP

// High-level module tidak diperbolehkan untuk bergantung pada low-level module. Keduanya harus bergantung pada abstraction.
// Abstraksi tidak diperbolehkan untuk bergantung pada detail. Detail harus bergantung pada abstraksi.

/*
    Contoh di dunia nyata:
    Robot tidak boleh tergantung dengan satu alat saja, namun bisa diubah-ubah. Misalnya robot tidak boleh hanya tergantung pada spatula saja untuk memasak, tapi bisa juga menggunakan pisau, penjepit atau centong
 */

fun main() {
    val pentrolEngine = PetrolEngine()
    val petrolCar = CarExmpl(pentrolEngine)

    val dieselEngine = DieselEngineExmpl()
    val dieselCar = CarExmpl(dieselEngine)

    val hybridEngine = HybridEngine()
    val hybridCar = CarExmpl(hybridEngine)

    // Boom boom
    petrolCar.start()
    dieselCar.start()
    hybridCar.start()
}

// High-level
interface EngineInterface {
    fun start() {}
}

class CarExmpl(private val engine: EngineInterface) {
    fun start() {
        engine.start()
    }
}

// Low-level
class PetrolEngine: EngineInterface {
    override fun start() {}
}

class HybridEngine: EngineInterface {
    override fun start() {}
}

class DieselEngineExmpl: EngineInterface {
    override fun start() {}
}