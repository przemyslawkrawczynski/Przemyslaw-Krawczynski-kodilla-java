package good.patterns.challenges.productOrderService;

import good.patterns.challenges.productOrderService.menswear.MensWearAvailable;
import good.patterns.challenges.productOrderService.menswear.MensWearInformationService;
import good.patterns.challenges.productOrderService.menswear.MensWearSendProcess;

public class SalesAplication {
    public static void main(String args[]) {

        OrderInformation orderInformation = new OrderInformation();
        Order order = orderInformation.getOrder();

        ProductOrderService orderService = new ProductOrderService(new MensWearAvailable(), new MensWearSendProcess(), new MensWearInformationService());
        OrderStatus orderStatus = orderService.process(order);

        if(orderStatus.isSended()) {
            System.out.println("Order Realized...");
        } else {
            System.out.println("Order didn`t realized...");
        }
    }
}
