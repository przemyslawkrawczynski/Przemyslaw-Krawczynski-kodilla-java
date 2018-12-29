package good.patterns.challenges.productOrderService;

public class Product {

    private String productName;
    private int price;
    private String productFeauters;

    public Product(String productName, int price, String productFeauters) {
        this.productName = productName;
        this.price = price;
        this.productFeauters = productFeauters;
    }

    public String getProductName() {
        return productName;
    }
}
