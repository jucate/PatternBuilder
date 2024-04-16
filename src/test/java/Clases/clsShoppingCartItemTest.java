package Clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class clsShoppingCartItemTest {

    private clsShoppingCartItem shoppingCartItem;

    @BeforeEach
    public void setUp() {
        shoppingCartItem = new clsShoppingCartItem();
    }

    @AfterEach
    public void tearDown() {
        shoppingCartItem = null;
    }

    @Test
    public void testConstructor() {
        assertNotNull(shoppingCartItem);
    }
}
