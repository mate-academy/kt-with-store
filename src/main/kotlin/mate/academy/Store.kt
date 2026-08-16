package mate.academy

class Store(var shoes: Int = 0, var shirts: Int = 0, var jackets: Int = 0) {
        fun printInventory(): String {
        return """
            Inventory:
            Shoes: $shoes
            Shirts: $shirts
            Jackets: $jackets
        """.trimIndent()
    }
}
