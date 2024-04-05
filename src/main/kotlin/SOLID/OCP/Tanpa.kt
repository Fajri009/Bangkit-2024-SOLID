package SOLID.OCP

open class Cinema(val price: Double)

class StandardCinema(price: Double) : Cinema(price)

class DeluxeCinema(price: Double) : Cinema(price)

class PremiumCinema(price: Double) : Cinema(price)

class CinemaCalculations {
    fun calculateAdminFee(cinema: Cinema): Double {
        return if (cinema is StandardCinema) {
            cinema.price * 10 / 100
        }
        else if (cinema is DeluxeCinema) {
            cinema.price * 12 / 100
        }
        else if (cinema is PremiumCinema) {
            cinema.price * 20 / 100
        }
        else 0.0
    }
}