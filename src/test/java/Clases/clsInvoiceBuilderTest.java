package Clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class clsInvoiceBuilderTest {

    private clsInvoiceBuilder invoiceBuilder;

    @BeforeEach
    public void setUp() {
        invoiceBuilder = new clsInvoiceBuilder();
    }

    @AfterEach
    public void tearDown() {
        invoiceBuilder = null;
    }

    @Test
    public void testOpCreateInvoice() {
        assertNotNull(invoiceBuilder.opCreateInvoice().myInvoice);
    }

    @Test
    public void testOpAddInvoiceItem() {
        clsShoppingCartItem shoppingCartItem = new clsShoppingCartItem();
        clsInvoiceBuilder result = invoiceBuilder.opCreateInvoice().opAddInvoiceItem(shoppingCartItem);
        assertNotNull(result.myInvoice);
        assertEquals(1, result.myInvoice.getClsInvoiceItem().size());
    }

    @Test
    public void testOpGetTotalCost() {
        clsInvoiceBuilder builder = new clsInvoiceBuilder();

        // Crear dos instancias separadas de clsShoppingCartItem
        clsShoppingCartItem shoppingCartItem1 = new clsShoppingCartItem();
        shoppingCartItem1.setPrice(10.0); // Establecer el precio del primer item
        shoppingCartItem1.setQuantity(2); // Establecer la cantidad del primer item

        clsShoppingCartItem shoppingCartItem2 = new clsShoppingCartItem();
        shoppingCartItem2.setPrice(20.0); // Establecer el precio del segundo item
        shoppingCartItem2.setQuantity(1); // Establecer la cantidad del segundo item

        // Agregar items a la factura
        builder.opCreateInvoice()
                .opAddInvoiceItem(shoppingCartItem1)
                .opAddInvoiceItem(shoppingCartItem2);

        // Verificar que el total de la factura es 40.0
        assertEquals(40.0, builder.opGetTotalCost(), 0.001);
    }

}
