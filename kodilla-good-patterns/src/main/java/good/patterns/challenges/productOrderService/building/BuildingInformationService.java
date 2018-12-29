package good.patterns.challenges.productOrderService.building;

import good.patterns.challenges.productOrderService.InformationService;
import good.patterns.challenges.productOrderService.Product;
import good.patterns.challenges.productOrderService.User;

public class BuildingInformationService implements InformationService {
    @Override
    public void massage(User user, Product product) {
        System.out.println("Sending massage to " + user.toString() + "that we start process order");
    }
}
