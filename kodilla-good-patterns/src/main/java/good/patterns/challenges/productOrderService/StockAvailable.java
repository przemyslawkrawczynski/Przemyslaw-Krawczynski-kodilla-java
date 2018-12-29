package good.patterns.challenges.productOrderService;

public interface StockAvailable {
    public boolean checkStockAvailable(int amount, Product product);
}
