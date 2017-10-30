package ro.siit.java.gitex2.data.store2;

/**
 * Created by andrei on 10/30/17.
 */
public class Store2 {
    private Product [] products = new Product[3];
    private int [] prices = {500, 350, 150};

    public void populateProducts(){
        products[0] = new Product("iphone x", "smartphone", 3);
        products[1] = new Product("galaxy s8", "smartphone", 10);
        products[2] = new Product("huawei P10", "smartphone", 1);

        System.out.println(products[1]);
    }

    public static void main(String[] args) {
        Store2 s2 = new Store2();
        s2.populateProducts();
    }
}
