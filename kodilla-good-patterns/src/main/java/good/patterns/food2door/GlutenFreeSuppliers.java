package good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeSuppliers implements SupplierSystemOptions {

    private HashMap<Product, Integer> productList = new HashMap<>();
    String supplierName, supplierAdress, supplierMail;
    int supplierPhone;

    public GlutenFreeSuppliers(String supplierName, String supplierAdress, String supplierMail, int supplierPhone) {
        this.supplierName = supplierName;
        this.supplierAdress = supplierAdress;
        this.supplierMail = supplierMail;
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierAdress() {
        return supplierAdress;
    }

    public String getSupplierMail() {
        return supplierMail;
    }

    public int getSupplierPhone() {
        return supplierPhone;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Przekazano do procesowania");
        if (checkProductAmount(orderRequest.getProduct(), orderRequest.getAmount())) {
            System.out.println("Potwierdzamy przyjęcie zamówienia -> " + orderRequest.getProduct().getName() + " | " + orderRequest.getAmount() + "szt |" + orderRequest.getData());
            sendProcess();
            informProcess();

            return true;

        } else  {
            System.out.println("Nie udało się zrealizować zamówienia z powodu braku towaru..");

            return false;
        }
    }

    @Override
    public boolean checkProductAmount(Product product, int amount) {

        boolean onStock = false;

        for (Map.Entry<Product, Integer> entry : productList.entrySet()) {
            if (entry.getKey() == product) {
                if (amount <= entry.getValue()) {
                    onStock = true;
                }
            }
        }

        return onStock;
    }

    @Override
    public void sendProcess() {
        System.out.println("Przekazano do kuriera...");

    }

    @Override
    public void informProcess() {
        System.out.println("Wysłano mail do klienta.");
    }

    public HashMap<Product, Integer> getProductList() {
        return productList;
    }
}
