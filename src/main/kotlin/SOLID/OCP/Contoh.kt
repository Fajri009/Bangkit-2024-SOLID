package SOLID.OCP

// Sebuah aturan yang mengatur di mana sebuah artefak perangkat lunak harus terbuka untuk ditambahkan tetapi tertutup untuk dimodifikasi

/*
    Contoh di dunia nyata:
    Robot yang bisa memasak, maka kemampuan memasak tersebut tidak boleh hilang ketika ada perubahan
 */
fun main() {
    val standardCinema = StandardCinemaExmpl(100.0)
    val adminFee = standardCinema.calculateAdminFee()
    print(adminFee)
}

abstract class CinemaExmpl(val price: Double) {
    abstract fun calculateAdminFee(): Double
}

class StandardCinemaExmpl(price: Double): CinemaExmpl(price) {
    override fun calculateAdminFee(): Double {
        return price * 10 / 100
    }
}

class DeluxeCinemaExmpl(price: Double): CinemaExmpl(price) {
    override fun calculateAdminFee(): Double {
        return price * 12 / 100
    }
}

class PremiumCinemaExmpl(price: Double): CinemaExmpl(price) {
    override fun calculateAdminFee(): Double {
        return price * 20 / 100
    }
}

class CoupleCinema(price: Double): CinemaExmpl(price) {
    override fun calculateAdminFee(): Double {
        return price * 15 / 100
    }
}