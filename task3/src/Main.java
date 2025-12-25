public class Main {

    public static void main(String[] args) {

        Product laptop = new Product("Сумка", 3500.0);
        Product mouse = new Product("Чемодан", 10000.0);
        Product keyboard = new Product("Рюкзак", 3000.0);

        Cart cart = new Cart();

        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);

        cart.printCart();

        System.out.println("Удаляем: Чемодан\n");
        cart.removeProduct("Чемодан");

        cart.printCart();
    }
}
