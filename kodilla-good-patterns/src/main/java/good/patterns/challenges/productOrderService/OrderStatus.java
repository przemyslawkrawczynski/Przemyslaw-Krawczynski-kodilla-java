package good.patterns.challenges.productOrderService;

public class OrderStatus {
    private User user;
    private Product product;
    private boolean isSended;

    public OrderStatus(User user, Product product, boolean isSended) {
        this.user = user;
        this.product = product;
        this.isSended = isSended;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isSended() {
        return isSended;
    }
}
