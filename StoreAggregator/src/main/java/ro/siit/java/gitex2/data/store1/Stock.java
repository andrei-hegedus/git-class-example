package ro.siit.java.gitex2.data.store1;

/**
 * Created by andrei on 10/30/17.
 */
public class Stock {
    String name;
    int nr;

    public Stock(String name, int nr) {
        this.name = name;
        this.nr = nr;
    }

    public String getName() {
        return name;
    }

    public int getNr() {
        return nr;
    }
}
