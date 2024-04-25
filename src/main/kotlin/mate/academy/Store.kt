package mate.academy

class Store(var shoes: Int = 0, var shirts: Int = 0, var jackets: Int = 0) {
    // Method to print out the inventory
    fun printInventory(): String {
        return """
            Inventory:
            Shoes: $shoes
            Shirts: $shirts
            Jackets: $jackets
        """.trimIndent()
    }
}
