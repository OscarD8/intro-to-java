package part4;

public class Product
{
    private double price;
    private int quantity;
    private String name;

    public Product(String initialName, double initialPrice, int initialQty) {
        this.price = initialPrice;
        this.name = initialName;
        this.quantity = initialQty;
    }

    public void printProduct() {
        System.out.println(name + ", " + "price " + price + ", " + quantity + " pcs.");
    }
}
