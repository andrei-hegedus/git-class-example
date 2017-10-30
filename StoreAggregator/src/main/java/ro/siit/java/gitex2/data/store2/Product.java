package ro.siit.java.gitex2.data.store2;

/**
 * Created by andrei on 10/30/17.
 */
public class Product {
    private String name;
    private String type;
    private int stock;

    public Product(String name, String type, int stock){
        this.name = name;
        this.type = type;
        this.stock = stock;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", stock=" + stock +
                '}';
    }
}
