package Clases;

public class clsShoppingCart {

    public java.util.Collection<clsShoppingCartItem> clsShoppingCartItem;

    public java.util.Collection<clsShoppingCartItem> getClsShoppingCartItem() {
        if (clsShoppingCartItem == null) {
            clsShoppingCartItem = new java.util.HashSet<clsShoppingCartItem>();
        }
        return clsShoppingCartItem;
    }

    public java.util.Iterator getIteratorClsShoppingCartItem() {
        if (clsShoppingCartItem == null) {
            clsShoppingCartItem = new java.util.HashSet<clsShoppingCartItem>();
        }
        return clsShoppingCartItem.iterator();
    }

    public void setClsShoppingCartItem(java.util.Collection<clsShoppingCartItem> newClsShoppingCartItem) {
        removeAllClsShoppingCartItem();
        for (java.util.Iterator iter = newClsShoppingCartItem.iterator(); iter.hasNext();) {
            addClsShoppingCartItem((clsShoppingCartItem) iter.next());
        }
    }

    public void addClsShoppingCartItem(clsShoppingCartItem newClsShoppingCartItem) {
        if (newClsShoppingCartItem == null) {
            return;
        }
        if (this.clsShoppingCartItem == null) {
            this.clsShoppingCartItem = new java.util.HashSet<clsShoppingCartItem>();
        }
        if (!this.clsShoppingCartItem.contains(newClsShoppingCartItem)) {
            this.clsShoppingCartItem.add(newClsShoppingCartItem);
        }
    }

    public void removeClsShoppingCartItem(clsShoppingCartItem oldClsShoppingCartItem) {
        if (oldClsShoppingCartItem == null) {
            return;
        }
        if (this.clsShoppingCartItem != null) {
            if (this.clsShoppingCartItem.contains(oldClsShoppingCartItem)) {
                this.clsShoppingCartItem.remove(oldClsShoppingCartItem);
            }
        }
    }

    public void removeAllClsShoppingCartItem() {
        if (clsShoppingCartItem != null) {
            clsShoppingCartItem.clear();
        }
    }
}
