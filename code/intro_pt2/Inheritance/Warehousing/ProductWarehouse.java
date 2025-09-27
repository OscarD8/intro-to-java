package intro_pt2.Inheritance.Warehousing;

public class ProductWarehouse extends Warehouse
{
    private String productName;

    public ProductWarehouse (String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }


    public void setName(String newName) {
        productName = newName;
    }

    public String getProductName() {
        return productName;
    }

    public String toString() {
        return productName + ": " + super.toString();
    }
}
