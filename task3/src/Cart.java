import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> products = new ArrayList<>();
    public void addProduct(Product p) {
        products.add(p);
    }
    public void removeProduct(String name) {
        products.removeIf(product -> product.getName().equalsIgnoreCase(name));
    }
    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
    public void printCart() {
        System.out.println("=== Корзина ===");

        int index = 1;
        for (Product product : products) {
            System.out.println(index + ". " + product);
            index++;
        }
        System.out.println("Итого: " + getTotal() + " руб.\n");
    }
}
