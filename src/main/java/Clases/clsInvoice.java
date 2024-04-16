package Clases;

public class clsInvoice {

    public java.util.Collection<clsInvoiceItem> clsInvoiceItem;

    public boolean opAddInvoiceItem(clsInvoiceItem prmInvoiceItem) {
        if (clsInvoiceItem == null) {
            clsInvoiceItem = new java.util.HashSet<clsInvoiceItem>();
        }
        return clsInvoiceItem.add(prmInvoiceItem);
    }

    public java.util.Collection<clsInvoiceItem> getClsInvoiceItem() {
        if (clsInvoiceItem == null) {
            clsInvoiceItem = new java.util.HashSet<clsInvoiceItem>();
        }
        return clsInvoiceItem;
    }

    public java.util.Iterator getIteratorClsInvoiceItem() {
        if (clsInvoiceItem == null) {
            clsInvoiceItem = new java.util.HashSet<clsInvoiceItem>();
        }
        return clsInvoiceItem.iterator();
    }

    public void setClsInvoiceItem(java.util.Collection<clsInvoiceItem> newClsInvoiceItem) {
        removeAllClsInvoiceItem();
        for (java.util.Iterator iter = newClsInvoiceItem.iterator(); iter.hasNext();) {
            addClsInvoiceItem((clsInvoiceItem) iter.next());
        }
    }

    public void addClsInvoiceItem(clsInvoiceItem newClsInvoiceItem) {
        if (newClsInvoiceItem == null) {
            return;
        }
        if (this.clsInvoiceItem == null) {
            this.clsInvoiceItem = new java.util.HashSet<clsInvoiceItem>();
        }
        if (!this.clsInvoiceItem.contains(newClsInvoiceItem)) {
            this.clsInvoiceItem.add(newClsInvoiceItem);
        }
    }

    public void removeClsInvoiceItem(clsInvoiceItem oldClsInvoiceItem) {
        if (oldClsInvoiceItem == null) {
            return;
        }
        if (this.clsInvoiceItem != null) {
            if (this.clsInvoiceItem.contains(oldClsInvoiceItem)) {
                this.clsInvoiceItem.remove(oldClsInvoiceItem);
            }
        }
    }

    public void removeAllClsInvoiceItem() {
        if (clsInvoiceItem != null) {
            clsInvoiceItem.clear();
        }
    }
}
