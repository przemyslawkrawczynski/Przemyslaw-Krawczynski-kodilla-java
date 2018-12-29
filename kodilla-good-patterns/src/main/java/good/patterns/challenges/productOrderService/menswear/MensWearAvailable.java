package good.patterns.challenges.productOrderService.menswear;

import good.patterns.challenges.productOrderService.Product;
import good.patterns.challenges.productOrderService.StockAvailable;

public class MensWearAvailable implements StockAvailable {
    @Override
    public boolean checkStockAvailable(int amount, Product product) {
        return true;
    }
}
