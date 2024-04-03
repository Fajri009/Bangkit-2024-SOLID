package RelasiPadaOOP.Association

// Ketika class User hancur, maka class Address yang memiliki hubungan dengan class User tersebut akan ikut hancur dan tidak bisa digunakan lagi
fun main() {
    val user2 = User2(id = "1234", name = "Khrisna", address = Address("123", "Bandung"))
}

class User2(
    private val id: String,
    private val name: String,
    private val address: Address
)

class Address(
    private val id: String,
    private val location: String
)

// Hubungan asosiasi dapat dikatakan komposisi jika hubungan tersebut adalah hubungan “memiliki”