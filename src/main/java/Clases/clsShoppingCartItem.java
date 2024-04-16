package Clases;
public class clsShoppingCartItem {
    private double price;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return price * quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}