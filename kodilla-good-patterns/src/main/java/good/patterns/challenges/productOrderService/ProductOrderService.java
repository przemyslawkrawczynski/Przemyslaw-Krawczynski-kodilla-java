package good.patterns.challenges.productOrderService;

public class ProductOrderService {
    private StockAvailable stockAvailable;
    private SendProcess sendProcess;
    private InformationService informationService;

    public ProductOrderService(StockAvailable stockAvailable, SendProcess sendProcess, InformationService informationService) {
        this.stockAvailable = stockAvailable;
        this.sendProcess = sendProcess;
        this.informationService = informationService;
    }

    public OrderStatus process(Order order) {
        boolean isAvailable = stockAvailable.checkStockAvailable(order.getOrderSize(), order.getProduct());
        if (isAvailable) {
           sendProcess.send(order.getUser(), order.getProduct());
           informationService.massage(order.getUser(), order.getProduct());
           return new OrderStatus(order.getUser(), order.getProduct(),  true);
        } else {
            return new OrderStatus(order.getUser(), order.getProduct(), false);
        }
    }
}
