package mate.academy

class StoreService {
    fun updateStoreStock(store: Store, extraShoes: Int, extraShirts: Int, extraJackets: Int) {
        with(store) {
            this.shoes += extraShoes
            this.shirts += extraShirts
            this.jackets += extraJackets
        }
    }
}
