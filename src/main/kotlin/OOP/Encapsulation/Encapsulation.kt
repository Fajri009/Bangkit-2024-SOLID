package OOP.Encapsulation

// Proses di mana sebuah penanganan data ditempatkan di dalam wadah tunggal yang disebut sebagai class
class Encapsulation {
    private val data = mutableListOf<Any>()

    fun setData() {
        val response = /* tons of logical code to retrieve data */
        data.clear()
//        data.putAll(response.data)
    }

    fun getData() = data
}