package ro.siit.java.gitex2.domain;

import ro.siit.java.gitex2.data.Product;
import ro.siit.java.gitex2.data.StoreAggregator;

/**
 * Created by andrei on 10/30/17.
 */
public class ProductSearch {

    private StoreAggregator storeAggregator;

    public ProductSearch(StoreAggregator storeAggregator) {
        this.storeAggregator = storeAggregator;
    }

    /**
     * Product must be in stock and have the cheapest price.
     * @param productName
     * @return
     */
    public Product findProductWithCheapestPrice(String productName){
        return null;
    }

}
