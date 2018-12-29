package good.patterns.food2door;

public class Order {
    Client client;
    Product product;
    Integer amount;
    boolean isRealized;

    public Order(Client client, Product product, Integer amount, boolean isRealized) {
        this.client = client;
        this.product = product;
        this.amount = amount;
        this.isRealized = isRealized;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getAmount() {
        return amount;
    }

    public boolean isRealized() {
        return isRealized;
    }
}
