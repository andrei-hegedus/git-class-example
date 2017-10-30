package ro.siit.java.gitex2.presentation;

import ro.siit.java.gitex2.data.Product;
import ro.siit.java.gitex2.data.StoreAggregator;
import ro.siit.java.gitex2.data.store1.Store1;
import ro.siit.java.gitex2.data.store2.Store2;
import ro.siit.java.gitex2.domain.ProductSearch;

/**
 * Created by andrei on 10/30/17.
 */
public class Main {

    public static void main(String[] args) {
        Store1 s1 = new Store1();
        Store2 s2 = new Store2();
        StoreAggregator storeAggregator = new StoreAggregator(s1, s2);
        ProductSearch ps = new ProductSearch(storeAggregator);
        Product productWithCheapestPrice = ps.findProductWithCheapestPrice("iphone x");

    }
}
