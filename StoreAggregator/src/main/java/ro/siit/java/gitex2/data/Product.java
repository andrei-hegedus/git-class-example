package ro.siit.java.gitex2.data;

/**
 * Created by andrei on 10/30/17.
 */
public class Product {
    private String name;
    private float price;
    private boolean inStock;
    private String supplier;

    public Product(String name, float price, boolean inStock, String supplier) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.supplier = supplier;
    }
}
