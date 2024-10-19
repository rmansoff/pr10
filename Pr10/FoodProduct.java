class FoodProduct extends Product {
    public FoodProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 0; 
    }
}
