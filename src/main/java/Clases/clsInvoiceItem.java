package Clases;

public class clsInvoiceItem {
    private double attDiscount;
    private double attValue;
    public clsShoppingCartItem myCartItem;

    public double getAttDiscount() {
        return attDiscount;
    }

    public void setAttDiscount(double attDiscount) {
        this.attDiscount = attDiscount;
    }

    public double getAttValue() {
        return attValue;
    }

    public void setAttValue(double attValue) {
        this.attValue = attValue;
    }

    public clsShoppingCartItem getMyCartItem() {
        return myCartItem;
    }

    public void setMyCartItem(clsShoppingCartItem myCartItem) {
        this.myCartItem = myCartItem;
    }
    
}
