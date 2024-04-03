package RelasiPadaOOP.Association

// Meskipun kelas Shop dihancurkan, class Seller masih dapat digunakan
// Sebaliknya, jika class Seller tidak ada, maka class Shop sudah tidak relevan lagi untuk digunakan
class Shop(
    private val id: String,
    private val name: String
) {
    var seller: Seller2
        set(value) {
            seller = value
        }
        get() {
            return seller
        }
//    ...
}

class Seller2(
    private val id: String,
    private val name: String
)

// Hubungan asosiasi dapat dikatakan hubungan agregasi jika terdapat objek yang “menggunakan” objek lainnya