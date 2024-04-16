package Clases;

public class clsInvoiceController {

    public java.util.Collection<clsInvoiceDirector> clsInvoiceDirector;

    public java.util.Collection<clsInvoiceDirector> getClsInvoiceDirector() {
        if (clsInvoiceDirector == null) {
            clsInvoiceDirector = new java.util.HashSet<clsInvoiceDirector>();
        }
        return clsInvoiceDirector;
    }

    public java.util.Iterator getIteratorClsInvoiceDirector() {
        if (clsInvoiceDirector == null) {
            clsInvoiceDirector = new java.util.HashSet<clsInvoiceDirector>();
        }
        return clsInvoiceDirector.iterator();
    }

    public void setClsInvoiceDirector(java.util.Collection<clsInvoiceDirector> newClsInvoiceDirector) {
        removeAllClsInvoiceDirector();
        for (java.util.Iterator iter = newClsInvoiceDirector.iterator(); iter.hasNext();) {
            addClsInvoiceDirector((clsInvoiceDirector) iter.next());
        }
    }

    public void addClsInvoiceDirector(clsInvoiceDirector newClsInvoiceDirector) {
        if (newClsInvoiceDirector == null) {
            return;
        }
        if (this.clsInvoiceDirector == null) {
            this.clsInvoiceDirector = new java.util.HashSet<clsInvoiceDirector>();
        }
        if (!this.clsInvoiceDirector.contains(newClsInvoiceDirector)) {
            this.clsInvoiceDirector.add(newClsInvoiceDirector);
        }
    }

    public void removeClsInvoiceDirector(clsInvoiceDirector oldClsInvoiceDirector) {
        if (oldClsInvoiceDirector == null) {
            return;
        }
        if (this.clsInvoiceDirector != null) {
            if (this.clsInvoiceDirector.contains(oldClsInvoiceDirector)) {
                this.clsInvoiceDirector.remove(oldClsInvoiceDirector);
            }
        }
    }

    public void removeAllClsInvoiceDirector() {
        if (clsInvoiceDirector != null) {
            clsInvoiceDirector.clear();
        }
    }
}
