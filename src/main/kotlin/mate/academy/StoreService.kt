package mate.academy

class StoreService {
    fun updateStoreStock(store: Store, extraShoes: Int, extraShirts: Int, extraJackets: Int) {
        with(store) {
            store.shoes += extraShoes
            store.shirts += extraShirts
            store.jackets += extraJackets
            store.printInventory()
        }
    }
}
