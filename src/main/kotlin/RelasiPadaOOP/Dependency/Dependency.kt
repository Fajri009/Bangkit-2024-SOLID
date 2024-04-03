package RelasiPadaOOP.Dependency

// Hubungan antara dua buah class, di mana satu class memiliki ketergantungan dengan class lainnya tetapi class lainnya tidak/mungkin memiliki ketergantungan terhadap class pertama tadi
class ShopService {
    fun changeProductPrice(price: String, product: Product) {
        product.changePrice(price)
    }
}

class Product(id: String, name: String, var price: String) {
    fun changePrice(value: String) {
        this.price = value
    }
}

// Kelas ShopService memiliki hubungan dengan kelas Product, tetapi kelas ShopService tidak memiliki atribut berupa kelas Product