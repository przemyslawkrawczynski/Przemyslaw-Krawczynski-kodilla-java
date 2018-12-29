package good.patterns.food2door;

public class Product {
    String name;
    int price;
    SupplierSystemOptions supplier;

    public Product(String name, int price, SupplierSystemOptions supplier) {
        this.name = name;
        this.price = price;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public SupplierSystemOptions getSupplier() {
        return supplier;
    }
}
