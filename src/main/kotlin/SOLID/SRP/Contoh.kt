package SOLID.SRP

// Mengatur tanggung jawab dari sebuah entitas yang berada di dalam sebuah proyek dalam hal ini adalah sebuah module/class untuk memenuhi kebutuhan dari actor

/*
    Contoh di dunia nyata:
    Robot tidak bisa menjadi koki, kasir, satpam, dan sopir sekaligus. Namun ia harus dipisah sesuai dengan tanggung jawab masing-masing.
 */
fun main() {
    val order = OrderExmpl()
    order.addItem(ItemExmpl())

    val repository = OrderHistory()
    repository.getMonthlyHistory()

    val viewer = OrderViewer()
    viewer.printOrder(order)
}

class OrderExmpl {
    fun calculateTotalSum() {}
    fun getItems() {}
    fun getItemCount() {}
    fun addItem(item: ItemExmpl) {}
    fun deleteItem(item: ItemExmpl) {}
}

class ItemExmpl
class OrderHistory {
    fun getDailyHistory() {}
    fun getMonthlyHistory() {}
}

class OrderViewer {
    fun printOrder(order: OrderExmpl) {}
    fun showOrder(order: OrderExmpl) {}
}