package mate.academy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StoreServiceTest {

    private val storeService = StoreService()

    @Test
    fun `'basic update' updates store correctly`() {
        val store = Store(shoes = 10, shirts = 20, jackets = 30)
        storeService.updateStoreStock(store, 10, 5, 3)

        assertEquals(20, store.shoes)
        assertEquals(25, store.shirts)
        assertEquals(33, store.jackets)
    }

    @Test
    fun `'zero values' do not change store stock`() {
        val store = Store(shoes = 10, shirts = 20, jackets = 30)
        storeService.updateStoreStock(store, 0, 0, 0)

        assertEquals(10, store.shoes)
        assertEquals(20, store.shirts)
        assertEquals(30, store.jackets)
    }

    @Test
    fun `'negative values' decrease store stock`() {
        val store = Store(shoes = 10, shirts = 20, jackets = 30)
        storeService.updateStoreStock(store, -5, -3, -2)

        assertEquals(5, store.shoes)
        assertEquals(17, store.shirts)
        assertEquals(28, store.jackets)
    }

    @Test
    fun `'initialization with custom values' updates store correctly`() {
        val store = Store(shoes = 10, shirts = 20, jackets = 30)
        storeService.updateStoreStock(store, 15, 10, 5)

        assertEquals(25, store.shoes)
        assertEquals(30, store.shirts)
        assertEquals(35, store.jackets)
    }
}
