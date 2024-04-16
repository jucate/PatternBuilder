package Clases;

import java.util.HashSet;

public class clsInvoiceDirector {

    public java.util.Collection<clsInvoiceBuilder> clsInvoiceBuilder;

    public boolean opCreateInvoice(clsShoppingCart prmShoppingCart) {
        if (clsInvoiceBuilder == null) {
            clsInvoiceBuilder = new HashSet<>();
        }

        // Crear un único constructor de factura
        clsInvoiceBuilder varObjInvoiceBuilder = new clsInvoiceBuilder();
        varObjInvoiceBuilder.opCreateInvoice();

        // Agregar todos los elementos del carrito de compras al constructor de factura
        for (clsShoppingCartItem varObjShoppingCartItem : prmShoppingCart.getClsShoppingCartItem()) {
            varObjInvoiceBuilder.opAddInvoiceItem(varObjShoppingCartItem);
        }

        // Agregar el constructor de factura al conjunto clsInvoiceBuilder
        return clsInvoiceBuilder.add(varObjInvoiceBuilder);
    }

    public java.util.Collection<clsInvoiceBuilder> getClsInvoiceBuilder() {
        if (clsInvoiceBuilder == null) {
            clsInvoiceBuilder = new java.util.HashSet<clsInvoiceBuilder>();
        }
        return clsInvoiceBuilder;
    }

    public java.util.Iterator getIteratorClsInvoiceBuilder() {
        if (clsInvoiceBuilder == null) {
            clsInvoiceBuilder = new java.util.HashSet<clsInvoiceBuilder>();
        }
        return clsInvoiceBuilder.iterator();
    }

    public void setClsInvoiceBuilder(java.util.Collection<clsInvoiceBuilder> newClsInvoiceBuilder) {
        removeAllClsInvoiceBuilder();
        for (java.util.Iterator iter = newClsInvoiceBuilder.iterator(); iter.hasNext();) {
            addClsInvoiceBuilder((clsInvoiceBuilder) iter.next());
        }
    }

    public void addClsInvoiceBuilder(clsInvoiceBuilder newClsInvoiceBuilder) {
        if (newClsInvoiceBuilder == null) {
            return;
        }
        if (this.clsInvoiceBuilder == null) {
            this.clsInvoiceBuilder = new java.util.HashSet<clsInvoiceBuilder>();
        }
        if (!this.clsInvoiceBuilder.contains(newClsInvoiceBuilder)) {
            this.clsInvoiceBuilder.add(newClsInvoiceBuilder);
        }
    }

    public void removeClsInvoiceBuilder(clsInvoiceBuilder oldClsInvoiceBuilder) {
        if (oldClsInvoiceBuilder == null) {
            return;
        }
        if (this.clsInvoiceBuilder != null) {
            if (this.clsInvoiceBuilder.contains(oldClsInvoiceBuilder)) {
                this.clsInvoiceBuilder.remove(oldClsInvoiceBuilder);
            }
        }
    }

    public void removeAllClsInvoiceBuilder() {
        if (clsInvoiceBuilder != null) {
            clsInvoiceBuilder.clear();
        }
    }
}
