package SOLID.LSP

import java.util.Date

// Aturan yang berlaku untuk hirarki pewarisan.
// Hal ini mengharuskan kita untuk mendesain kelas-kelas yang kita miliki sehingga ketergantungan antar klien dapat disubstitusikan tanpa klien mengetahui tentang perubahan yang ada

/*
    Contoh di dunia nyata:
    Jadi, anak robot harus bisa melakukan apa yang ibunya bisa. Misalnya ibunya bisa buat teh, maka anaknya pun juga harus bisa melakukan hal yang sama. Itulah yang disebut dengan LSP
 */
abstract class ProductExmpl {
    abstract fun getName(): String

    /**
     * Function to get all of information about product
     */

    fun getProductInfo(){
        // some magic code
    }
}

abstract class FoodProduct: ProductExmpl() {
    abstract fun getExpiredDate(): Date
}

class VegetableExmpl: FoodProduct() {
    override fun getExpiredDate(): Date {
        return Date()
    }

    override fun getName(): String {
        return "Broccoli"
    }
}