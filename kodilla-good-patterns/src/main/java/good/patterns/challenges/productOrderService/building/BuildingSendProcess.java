package good.patterns.challenges.productOrderService.building;

import good.patterns.challenges.productOrderService.Product;
import good.patterns.challenges.productOrderService.SendProcess;
import good.patterns.challenges.productOrderService.User;

public class BuildingSendProcess implements SendProcess {
    @Override
    public void send(User user, Product product) {
        System.out.println("Realized shipment [" + product.getProductName() + "] to user [" + user.toString() + "]");
    }
}
