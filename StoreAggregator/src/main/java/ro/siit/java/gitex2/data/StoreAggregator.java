package ro.siit.java.gitex2.data;

import ro.siit.java.gitex2.data.store1.Store1;
import ro.siit.java.gitex2.data.store2.Store2;

/**
 * Created by andrei on 10/30/17.
 */
public class StoreAggregator {

    private Store1 store1;
    private Store2 store2;

    public StoreAggregator(Store1 s1, Store2 s2) {
        store1 = s1;
        store2 = s2;
    }

    public Product [] getProductsFromAllStores(){
        return null;
    }
}
