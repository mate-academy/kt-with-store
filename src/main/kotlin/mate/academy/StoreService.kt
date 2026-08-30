package mate.academy

class StoreService {
    fun updateStoreStock(store: Store, extraShoes: Int, extraShirts: Int, extraJackets: Int) {
        with(store) {
            shoes += extraShoes
            shirts +=extraShirts
            jackets +=extraJackets
        }
    }
}
