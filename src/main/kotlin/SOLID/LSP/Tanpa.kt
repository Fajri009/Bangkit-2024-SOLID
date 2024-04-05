package SOLID.LSP

import java.util.*

abstract class Product {
    abstract fun getName(): String
    abstract fun getExpiredDate(): Date

    /**
     * Function to get all of information about product
     */

    fun getProductInfo() {
        // some magic code
    }
}

class Vegetable: Product() {
    override fun getName(): String {
        return "Brocolli"
    }

    override fun getExpiredDate(): Date {
        return Date()
    }
}

class Smartphone : Product() {

    override fun getName(): String {
        return "Samsung S10+ Limited Edition"
    }

    override fun getExpiredDate(): Date {
        return Date() // ???????
    }
}