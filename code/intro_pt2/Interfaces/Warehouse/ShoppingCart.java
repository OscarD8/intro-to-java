package intro_pt2.Interfaces.Warehouse;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart
{
    private Map<String, Item> cart;

    public ShoppingCart() {
        cart = new HashMap<>();
    }


    public void add(String product, int price) {
        if (!cart.containsKey(product)) {
            cart.putIfAbsent(product, new Item(product, price));
            return;
        }
        cart.get(product).increaseQuantity();
    }

    public int price() {
        int totalPrice = 0;
        for (Item item : cart.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : cart.values()) {
            System.out.println(item.product + ": " + item.qty);
        }
    }
}
