package Clases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class clsInvoiceItemTest {

    @Test
    public void testGetSetAttDiscount() {
        clsInvoiceItem invoiceItem = new clsInvoiceItem();
        double discount = 10.0;
        invoiceItem.setAttDiscount(discount);
        assertEquals(discount, invoiceItem.getAttDiscount(), 0.001);
    }

    @Test
    public void testGetSetAttValue() {
        clsInvoiceItem invoiceItem = new clsInvoiceItem();
        double value = 100.0;
        invoiceItem.setAttValue(value);
        assertEquals(value, invoiceItem.getAttValue(), 0.001);
    }

    @Test
    public void testGetSetMyCartItem() {
        clsInvoiceItem invoiceItem = new clsInvoiceItem();
        clsShoppingCartItem shoppingCartItem = new clsShoppingCartItem();
        invoiceItem.setMyCartItem(shoppingCartItem);
        assertEquals(shoppingCartItem, invoiceItem.getMyCartItem());
    }
}