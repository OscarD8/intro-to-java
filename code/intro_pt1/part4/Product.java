package intro_pt1.part4;

public class Product
{
    private final double price;
    private final int quantity;
    private final String name;

    public Product(String initialName, double initialPrice, int initialQty) {
        this.price = initialPrice;
        this.name = initialName;
        this.quantity = initialQty;
    }

    public void printProduct() {
        System.out.println(name + ", " + "price " + price + ", " + quantity + " pcs.");
    }
}
