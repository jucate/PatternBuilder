package Clases;

public class clsInvoiceBuilder {

    public clsInvoice myInvoice;

    public clsInvoiceBuilder opCreateInvoice() {
        myInvoice = new clsInvoice();
        return this;
    }

    public clsInvoiceBuilder opAddInvoiceItem(clsShoppingCartItem prmShoppingCartItem) {
        if (myInvoice == null) {
            opCreateInvoice(); // Crear la factura si aún no existe
        }

        clsInvoiceItem varObjInvoiceItem = new clsInvoiceItem();
        varObjInvoiceItem.setAttValue(prmShoppingCartItem.getCost());
        varObjInvoiceItem.setMyCartItem(prmShoppingCartItem);
        myInvoice.opAddInvoiceItem(varObjInvoiceItem);
        return this;
    }

    public double opGetTotalCost() {
        double varTotalCost = 0;

        // Verificar si myInvoice no es null antes de intentar obtener sus elementos
        if (myInvoice != null) {
            for (clsInvoiceItem varObjInvoiceItem : myInvoice.getClsInvoiceItem()) {
                clsShoppingCartItem shoppingCartItem = varObjInvoiceItem.getMyCartItem();
                if (shoppingCartItem != null) {
                    varTotalCost += varObjInvoiceItem.getAttValue();
                }
            }
        }

        return varTotalCost;
    }

}
