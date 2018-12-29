package good.patterns.food2door;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequest {

    private Client client;
    private Product product;
    private LocalDateTime data;
    private int amount;

    public OrderRequest(Client client, Product product, int amount, LocalDateTime data) {
        this.client = client;
        this.product = product;
        this.amount = amount;
        this.data = data;
    }

    public int getAmount() { return amount;}

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getData() {
        return data;
    }
}
