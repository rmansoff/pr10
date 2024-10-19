class ElectronicsProduct extends Product {
    public ElectronicsProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return getPrice() * 0.15; 
    }
}
