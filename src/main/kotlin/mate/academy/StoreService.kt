package mate.academy

class StoreService {
    // Function to update the store's stock with `with`
    fun updateStoreStock(store: Store, extraShoes: Int, extraShirts: Int, extraJackets: Int) {
        with(store) {
            store.shoes += extraShoes
            store.shirts += extraShirts
            store.jackets += extraJackets
        }
    }
}
