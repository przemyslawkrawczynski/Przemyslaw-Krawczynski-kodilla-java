package good.patterns.food2door;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GenerateData {

    GlutenFreeSuppliers glutenFreeShop = new GlutenFreeSuppliers("Gluten Shop", "38-256 Katowice ,al Pokoju 78", "gf@supplier.pl", 345566625);
    HealthySuppliers healthyShop = new HealthySuppliers("Healthy Shop", "31-417 Kraków, Lagiewnicka 60", "hs@supplier.pl", 125642526);
    FoodSuppliers foodShop = new FoodSuppliers("Food Shop", "03-156 Warszawa, Modlińska 129", "fs@supplier.pl", 225695658);

    Product gFreeProduct = new Product("Gluten Free Bread", 9, glutenFreeShop);
    Product healthyProduct = new Product("Aspirin", 29, healthyShop);
    Product foodProduct = new Product("Cheese", 26, foodShop);
    ArrayList<Product> allProductList = new ArrayList<>();
    ArrayList<SupplierSystemOptions> supplierList = new ArrayList<>();

    public void generateData(){

        allProductList.add(gFreeProduct);
        allProductList.add(healthyProduct);
        allProductList.add(foodProduct);

        supplierList.add(glutenFreeShop);
        supplierList.add(healthyShop);
        supplierList.add(foodShop);

        glutenFreeShop.getProductList().put(gFreeProduct,5);

    }

    public OrderRequest getSimpleOrderRequest() {
        Client client = new Client("Jan", "Kowalski", "Krakow, Radzikowskiego 127/10", "jk@o2.pl");
        return new OrderRequest(client, gFreeProduct,2, LocalDateTime.now());
    }

    public ArrayList<Product> getAllProductList() {
        return allProductList;
    }

    public ArrayList<SupplierSystemOptions> getSupplierList() {
        return supplierList;
    }
}
