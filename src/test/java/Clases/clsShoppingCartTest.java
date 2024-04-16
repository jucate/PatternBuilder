package Clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class clsShoppingCartTest {

    private clsShoppingCart shoppingCart;

    @BeforeEach
    public void setUp() {
        shoppingCart = new clsShoppingCart();
    }

    @AfterEach
    public void tearDown() {
        shoppingCart = null;
    }

    @Test
    public void testGetClsShoppingCartItem() {
        assertNotNull(shoppingCart.getClsShoppingCartItem());
    }

    @Test
    public void testGetIteratorClsShoppingCartItem() {
        assertNotNull(shoppingCart.getIteratorClsShoppingCartItem());
    }

    @Test
    public void testSetClsShoppingCartItem() {
        clsShoppingCartItem item1 = new clsShoppingCartItem();
        clsShoppingCartItem item2 = new clsShoppingCartItem();

        java.util.Collection<clsShoppingCartItem> items = new java.util.HashSet<>();
        items.add(item1);
        items.add(item2);

        shoppingCart.setClsShoppingCartItem(items);

        assertEquals(2, shoppingCart.getClsShoppingCartItem().size());
        assertTrue(shoppingCart.getClsShoppingCartItem().contains(item1));
        assertTrue(shoppingCart.getClsShoppingCartItem().contains(item2));
    }

    @Test
    public void testAddClsShoppingCartItem() {
        clsShoppingCartItem item = new clsShoppingCartItem();

        shoppingCart.addClsShoppingCartItem(item);

        assertEquals(1, shoppingCart.getClsShoppingCartItem().size());
        assertTrue(shoppingCart.getClsShoppingCartItem().contains(item));
    }

    @Test
    public void testRemoveClsShoppingCartItem() {
        clsShoppingCartItem item = new clsShoppingCartItem();

        shoppingCart.addClsShoppingCartItem(item);
        shoppingCart.removeClsShoppingCartItem(item);

        assertEquals(0, shoppingCart.getClsShoppingCartItem().size());
        assertFalse(shoppingCart.getClsShoppingCartItem().contains(item));
    }

    @Test
    public void testRemoveAllClsShoppingCartItem() {
        clsShoppingCartItem item1 = new clsShoppingCartItem();
        clsShoppingCartItem item2 = new clsShoppingCartItem();

        shoppingCart.addClsShoppingCartItem(item1);
        shoppingCart.addClsShoppingCartItem(item2);
        shoppingCart.removeAllClsShoppingCartItem();

        assertEquals(0, shoppingCart.getClsShoppingCartItem().size());
    }
}