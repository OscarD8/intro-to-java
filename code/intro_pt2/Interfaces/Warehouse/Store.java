package intro_pt2.Interfaces.Warehouse;

import java.util.Scanner;

public class Store
{
    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner   = scanner;
    }


    public void shop(String customer) {
        ShoppingCart shoppingCart = new ShoppingCart();
        System.out.println("Welcome to Shamansburys");
        System.out.println("our selection:");

        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What to put in the cart bitch? (Enter to go to register bitch) : ");
            String product = scanner.nextLine();

            if (product.isEmpty()) {
                break;
            }

            if (warehouse.products().contains(product)) {
                boolean isStock = warehouse.take(product);
                if (isStock) {
                    shoppingCart.add(product, warehouse.price(product));
                }
                else {
                    System.out.println("Out of stock: " + product);
                }
            } else {
                System.out.println("Product: " + product + " not available.");
            }
        }
        System.out.println("Your shopping cart contents: ");
        shoppingCart.print();
        System.out.println("Total: " + shoppingCart.price());
    }
}
