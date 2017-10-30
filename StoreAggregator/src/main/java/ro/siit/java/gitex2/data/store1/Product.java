package ro.siit.java.gitex2.data.store1;

/**
 * Created by andrei on 10/30/17.
 */
public class Product {
    String name;
    float price;
    String type;
   public Product(String name, float price, String type) {
       this.name=name;
       this.price=price;
       this.type=type;
   }

   public String getName() {
       return name;
   }
    public float getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }
}
