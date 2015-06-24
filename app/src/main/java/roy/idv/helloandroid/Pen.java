package roy.idv.helloandroid;

/**
 * Created by 201 on 2015/6/24.
 */
public class Pen {
    private String name;
    private int price;

    public Pen(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
