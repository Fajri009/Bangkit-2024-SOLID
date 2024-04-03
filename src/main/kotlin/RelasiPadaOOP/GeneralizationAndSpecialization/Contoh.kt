package RelasiPadaOOP.GeneralizationAndSpecialization

// Generalization (khusus ke umum)
// Specialization (umum ke khusus)
abstract class Product(id: String, name: String, price: String)

class ElectronicProduct(id: String, name: String, price: String, productionDate: String): Product(id, name, price)

class ConsumableProduct(id: String, name: String, price: String, expirationDate: String): Product(id, name, price)