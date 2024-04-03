package RelasiPadaOOP.Association

class Seller(
    private val id: String,
    private val name: String
)

class User(
    private val id: String,
    private val name: String,
    private val sellers: List<Seller>
)