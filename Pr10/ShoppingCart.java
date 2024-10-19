import java.util.ArrayList;

class ShoppingCart {
    private ArrayList<Product> products;
    private double total;

    public ShoppingCart() {
        this.products = new ArrayList<>();
        this.total = 0;
    }

    // Метод для додавання продукту в кошик
    public void addProduct(Product product) {
        products.add(product);
        total += product.getPrice();
    }

    public double calculateDiscount() {
        double discount = 0;
        for (Product product : products) {
            discount += product.getDiscount();
        }
        return discount;
    }

    public void displayCart() {
        System.out.println("Product list:");
        for (Product product : products) {
            double discount = product.getDiscount();
            System.out.println(product.getName() + ": $" + product.getPrice() + " (Discount: $" + discount + ")");
        }
        double totalDiscount = calculateDiscount();
        System.out.println("Total price before discount: $" + total);
        System.out.println("Total discount: $" + totalDiscount);
        System.out.println("Final total: $" + (total - totalDiscount));
    }
}
