package good.patterns.challenges.productOrderService.menswear;

import good.patterns.challenges.productOrderService.InformationService;
import good.patterns.challenges.productOrderService.Product;
import good.patterns.challenges.productOrderService.User;

public class MensWearInformationService implements InformationService {
    @Override
    public void massage(User user, Product product) {
        System.out.println("Sending massage to " + user.getUserName() + " that we start process order -> " + product.getProductName());
    }
}