package mate.academy

class StoreService {
    // Function to update the store's stock with `with`
    fun updateStoreStock(store: Store, extraShoes: Int, extraShirts: Int, extraJackets: Int) {
        with(store) {
            with(store) {
                shoes += extraShoes
                shirts += extraShirts
                jackets += extraJackets
                printInventory()
            }
        }
    }
}
