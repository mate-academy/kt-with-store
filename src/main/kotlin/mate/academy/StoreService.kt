package mate.academy

class StoreService {
    // Function to update the store's stock with `with`
    fun updateStoreStock(store: Store, extraShoes: Int, extraShirts: Int, extraJackets: Int) {
        with(store) {
            // Тепер 'shoes', 'shirts' та 'jackets'
            // відносяться до переданого об'єкта 'store'
            shoes += extraShoes
            shirts += extraShirts
            jackets += extraJackets
        }
    }
}
