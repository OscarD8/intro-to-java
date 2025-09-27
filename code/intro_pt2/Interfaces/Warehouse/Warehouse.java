package intro_pt2.Interfaces.Warehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse
{
    private Map<String, ArrayList<Integer>> products;

    public Warehouse() {
        products = new HashMap<>();
    }


    public void addProduct(String product, int price, int stock) {
        products.putIfAbsent(product, new ArrayList<>());
        products.get(product).add(price);
        products.get(product).add(stock);
    }

    public int price(String product) {
        try {
            return products.get(product).getFirst();
        } catch (Exception e) {
            return -99;
        }
    }

    public int stock(String product) {
        try {
            return products.get(product).get(1);
        } catch (Exception e) {
            return 0;
        }
    }

    public boolean take(String product) {
        try {
            if (products.get(product).get(1) - 1 >= 0) {
                int stock = products.get(product).get(1) - 1;
                products.get(product).set(1, stock);
                return true;
            }
            return false;

        } catch (Exception e) {
            return false;
        }
    }

    public Set<String> products() {
        return products.keySet();
    }
}
