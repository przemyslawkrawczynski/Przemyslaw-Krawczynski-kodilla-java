package good.patterns.food2door;

import java.util.ArrayList;

public class RunnerTest {
    public static void main(String args[]) {
        GenerateData gd = new GenerateData();
        gd.generateData();

        ArrayList<Product> allProducts = gd.getAllProductList();
        OrderRequest orderRequest  = gd.getSimpleOrderRequest();

        SupplierSystemOptions supplier = orderRequest.getProduct().getSupplier();
        OrderProcessor orderProcessor = new OrderProcessor();

        boolean isRealized = orderProcessor.realizeOrder(orderRequest).isRealized();

        if(isRealized) {
            System.out.println("Drogi kliencie otrzymaliśmy informację od dostawcy " + orderRequest.getProduct().getSupplier().getSupplierName() + " o prawidłowej realizacji zamówienia.");
        } else {
            System.out.println("Nie udało się zrealizować zamówienia");
        }
    }
}

