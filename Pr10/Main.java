public class Main {
    public static void main(String[] args) {
        Product apple = new FoodProduct("Apple", 1.25);
        Product laptop = new ElectronicsProduct("Laptop", 999.99);
        Product smartphone = new ElectronicsProduct("Smartphone", 799.99);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(apple);
        cart.addProduct(laptop);
        cart.addProduct(smartphone);

        cart.displayCart();
    }
}
