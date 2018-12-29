package good.patterns.food2door;

import java.util.HashMap;


public interface SupplierSystemOptions {
    public boolean process(OrderRequest orderRequest);
    public boolean checkProductAmount(Product product, int amount);
    public void sendProcess();
    public void informProcess();
    public String getSupplierName();

}
