package good.patterns.food2door;

public class OrderProcessor {

    public Order realizeOrder(OrderRequest orderRequest) {
        boolean isRealized = orderRequest.getProduct().getSupplier().process(orderRequest);
        return new Order(orderRequest.getClient(), orderRequest.getProduct(), orderRequest.getAmount(), isRealized);
    }
}
