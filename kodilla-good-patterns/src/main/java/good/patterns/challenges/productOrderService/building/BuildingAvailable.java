package good.patterns.challenges.productOrderService.building;

import good.patterns.challenges.productOrderService.Product;
import good.patterns.challenges.productOrderService.StockAvailable;

public class BuildingAvailable implements StockAvailable {
    @Override
    // without engine always return true in this example
    public boolean checkStockAvailable(int amount, Product product) {
        return true;
    }
}
