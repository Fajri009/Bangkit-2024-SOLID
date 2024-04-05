package SOLID.ISP

// Pemisahan tanggung jawab
// Prinsip ini sendiri bertujuan untuk mengurangi jumlah ketergantungan sebuah class terhadap interface class yang tidak dibutuhkan

/*
    Contoh di dunia nyata:
    Robot yang nggak punya alat untuk menyelesaikan tugas, jangan diberi tugas yang tidak semestinya. Misalnya robot yang tidak punya sayap, seharusnya tidak diberikan tugas untuk terbang. Namun sesuaikan tugas dengan kebutuhan masing-masing
 */

interface VehichleInterfaceExmpl {
    fun drive()
    fun stop()
    fun refuel()
}

interface DoorInterface {
    fun openDoors()
}

class MotorcycleExmpl: VehichleInterfaceExmpl {
    override fun drive() {}
    override fun stop() {}
    override fun refuel() {}
}

class CarExmpl: VehichleInterfaceExmpl, DoorInterface {
    override fun drive() {}
    override fun stop() {}
    override fun refuel() {}
    override fun openDoors() {}
}