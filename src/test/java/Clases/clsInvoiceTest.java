package Clases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class clsInvoiceTest {
    
    @Test
    public void testOpAddInvoiceItem() {
        clsInvoice invoice = new clsInvoice();
        clsInvoiceItem invoiceItem = new clsInvoiceItem();

        assertTrue(invoice.opAddInvoiceItem(invoiceItem));
        assertEquals(1, invoice.getClsInvoiceItem().size());
    }

    @Test
    public void testGetClsInvoiceItem() {
        clsInvoice invoice = new clsInvoice();
        assertNotNull(invoice.getClsInvoiceItem());
        assertEquals(0, invoice.getClsInvoiceItem().size());
    }

    @Test
    public void testGetIteratorClsInvoiceItem() {
        clsInvoice invoice = new clsInvoice();
        assertNotNull(invoice.getIteratorClsInvoiceItem());
    }

    @Test
    public void testSetClsInvoiceItem() {
        clsInvoice invoice = new clsInvoice();
        clsInvoiceItem invoiceItem1 = new clsInvoiceItem();
        clsInvoiceItem invoiceItem2 = new clsInvoiceItem();

        java.util.Collection<clsInvoiceItem> invoiceItems = new java.util.HashSet<>();
        invoiceItems.add(invoiceItem1);
        invoiceItems.add(invoiceItem2);

        invoice.setClsInvoiceItem(invoiceItems);

        assertEquals(2, invoice.getClsInvoiceItem().size());
        assertTrue(invoice.getClsInvoiceItem().contains(invoiceItem1));
        assertTrue(invoice.getClsInvoiceItem().contains(invoiceItem2));
    }

    @Test
    public void testAddClsInvoiceItem() {
        clsInvoice invoice = new clsInvoice();
        clsInvoiceItem invoiceItem = new clsInvoiceItem();

        invoice.addClsInvoiceItem(invoiceItem);

        assertEquals(1, invoice.getClsInvoiceItem().size());
        assertTrue(invoice.getClsInvoiceItem().contains(invoiceItem));
    }

    @Test
    public void testRemoveClsInvoiceItem() {
        clsInvoice invoice = new clsInvoice();
        clsInvoiceItem invoiceItem = new clsInvoiceItem();

        invoice.addClsInvoiceItem(invoiceItem);
        invoice.removeClsInvoiceItem(invoiceItem);

        assertEquals(0, invoice.getClsInvoiceItem().size());
        assertFalse(invoice.getClsInvoiceItem().contains(invoiceItem));
    }

    @Test
    public void testRemoveAllClsInvoiceItem() {
        clsInvoice invoice = new clsInvoice();
        clsInvoiceItem invoiceItem1 = new clsInvoiceItem();
        clsInvoiceItem invoiceItem2 = new clsInvoiceItem();

        invoice.addClsInvoiceItem(invoiceItem1);
        invoice.addClsInvoiceItem(invoiceItem2);
        invoice.removeAllClsInvoiceItem();

        assertEquals(0, invoice.getClsInvoiceItem().size());
    }
}
