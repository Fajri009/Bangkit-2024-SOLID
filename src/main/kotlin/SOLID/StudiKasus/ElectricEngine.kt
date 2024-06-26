package SOLID.StudiKasus

class ElectricMotor {
    fun rotate(battery: Battery) {
        // Rotate the motor using electric power from battery
    }
}

class BatteryManagementSystem {
    fun getBattery(): Battery {
        return Battery(Electrons())
    }
}

class SpeedController(
    private val bms: BatteryManagementSystem,
    private val motor: ElectricMotor
) {
    fun control() {
        val battery = bms.getBattery()
        motor.rotate(battery)
    }
}

class ElectricEngine(private val speedController: SpeedController): EngineInterface {
    override fun move() {
        speedController.control()
    }
}

class Electrons {

}

class Battery(private var electrons: Electrons): StorageInterface<Electrons> {
    override fun fill(source: Electrons) {
        this.electrons = source
    }

    override fun getSource(): Electrons {
        return electrons
    }
}