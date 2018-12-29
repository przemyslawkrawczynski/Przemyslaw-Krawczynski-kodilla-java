package good.patterns.challenges.productOrderService;

import java.time.LocalDateTime;

public class Order {

    private User user;
    private Product product;
    private LocalDateTime orderTime;
    private int orderSize;

    public Order(User user, Product product, LocalDateTime orderTime, int orderSize) {
        this.user = user;
        this.product = product;
        this.orderTime = orderTime;
        this.orderSize = orderSize;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public int getOrderSize() {
        return orderSize;
    }
}
