package SOLID.StudiKasus

fun main() {
    // Petrol Car
    val tank = Tank()
    val oilPipe = OilPipe()
    val piston = Piston()

    val petrolEngine = PetrolEngine(oilPipe, piston)
    val petrolCar = Car<Oil>(petrolEngine, tank)

    val oil = Oil()
    petrolCar.refill(oil)
    petrolCar.accelerate()
    petrolCar.brake()

    // Electric Car
    val electrons = Electrons()
    val battery = Battery(electrons)
    
    val speedController = SpeedController(BatteryManagementSystem(), ElectricMotor())
    val electricEngine = ElectricEngine(speedController)
    val electricCar = Car<Electrons>(electricEngine, battery)

    electricCar.refill(electrons)
    electricCar.accelerate()
    electricCar.brake()
}

interface Vehicle<T> {
    fun accelerate()
    fun brake()
    fun refill(source: T)
}

class Car<T>(private val engine: EngineInterface?, private val storage: StorageInterface<T>): Vehicle<T> {
    override fun accelerate() {
        engine?.move()
    }

    override fun brake() {

    }

    override fun refill(source: T) {
        storage.fill(source)
    }
}

interface EngineInterface {
    fun move()
}

interface StorageInterface<T> {
    fun fill(source: T)
    fun getSource(): T
}

