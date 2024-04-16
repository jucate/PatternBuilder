package Clases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class clsInvoiceDirectorTest {

    @Test
    public void testOpCreateInvoice() {
        clsInvoiceDirector invoiceDirector = new clsInvoiceDirector();

        // Crear un carrito de compras con dos elementos
        clsShoppingCart shoppingCart = new clsShoppingCart();
        clsShoppingCartItem item1 = new clsShoppingCartItem();
        item1.setPrice(10.0);
        item1.setQuantity(2);
        shoppingCart.addClsShoppingCartItem(item1);

        clsShoppingCartItem item2 = new clsShoppingCartItem();
        item2.setPrice(20.0);
        item2.setQuantity(1);
        shoppingCart.addClsShoppingCartItem(item2);

        // Crear la factura usando el director de facturación
        invoiceDirector.opCreateInvoice(shoppingCart);

        // Verificar que el director de facturación tenga una factura creada
        assertEquals(1, invoiceDirector.getClsInvoiceBuilder().size());

        // Obtener la factura creada
        clsInvoiceBuilder invoiceBuilder = invoiceDirector.getClsInvoiceBuilder().iterator().next();

        // Verificar que el total de la factura es 30.0
        assertEquals(40.0, invoiceBuilder.opGetTotalCost(), 0.001);
    }

}
