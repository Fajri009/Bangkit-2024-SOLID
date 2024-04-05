package SOLID.ISP

interface VehichleInterface {
    fun drive()
    fun stop()
    fun refuel()
    fun openDoors()
}

class Motorcycle: VehichleInterface {
    // Can be implemented
    override fun drive() {}
    override fun stop() {}
    override fun refuel() {}


    //Pain point
    // Can not be implemented
    override fun openDoors() {}
}