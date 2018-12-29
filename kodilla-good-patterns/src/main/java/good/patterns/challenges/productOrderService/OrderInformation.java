package good.patterns.challenges.productOrderService;

import java.time.LocalDateTime;

public class OrderInformation {

    public Order getOrder() {
        User user = new User("Jan Kowalski", "03-186 Warszawa, Żeromskiego 9",666222101,"jk@op.pl");
        Product product = new Product("Sockets", 15, "Blue");
        int orderSize = 5;
        Order order = new Order(user, product, LocalDateTime.now(), 5);

        return order;
    }
}
