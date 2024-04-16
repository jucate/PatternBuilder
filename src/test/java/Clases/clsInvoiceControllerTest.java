package Clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class clsInvoiceControllerTest {
    
    private clsInvoiceController invoiceController;

    @BeforeEach
    public void setUp() {
        invoiceController = new clsInvoiceController();
    }

    @AfterEach
    public void tearDown() {
        invoiceController = null;
    }

    @Test
    public void testAddClsInvoiceDirector() {
        clsInvoiceDirector invoiceDirector = new clsInvoiceDirector();
        invoiceController.addClsInvoiceDirector(invoiceDirector);
        assertTrue(invoiceController.getClsInvoiceDirector().contains(invoiceDirector));
    }

    @Test
    public void testRemoveClsInvoiceDirector() {
        clsInvoiceDirector invoiceDirector = new clsInvoiceDirector();
        invoiceController.addClsInvoiceDirector(invoiceDirector);
        invoiceController.removeClsInvoiceDirector(invoiceDirector);
        assertFalse(invoiceController.getClsInvoiceDirector().contains(invoiceDirector));
    }

    @Test
    public void testGetClsInvoiceDirector() {
        clsInvoiceDirector invoiceDirector1 = new clsInvoiceDirector();
        clsInvoiceDirector invoiceDirector2 = new clsInvoiceDirector();
        invoiceController.addClsInvoiceDirector(invoiceDirector1);
        invoiceController.addClsInvoiceDirector(invoiceDirector2);
        assertEquals(2, invoiceController.getClsInvoiceDirector().size());
    }

    @Test
    public void testRemoveAllClsInvoiceDirector() {
        clsInvoiceDirector invoiceDirector1 = new clsInvoiceDirector();
        clsInvoiceDirector invoiceDirector2 = new clsInvoiceDirector();
        invoiceController.addClsInvoiceDirector(invoiceDirector1);
        invoiceController.addClsInvoiceDirector(invoiceDirector2);
        invoiceController.removeAllClsInvoiceDirector();
        assertTrue(invoiceController.getClsInvoiceDirector().isEmpty());
    }
    
}
