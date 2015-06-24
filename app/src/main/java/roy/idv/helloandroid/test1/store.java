package roy.idv.helloandroid.test1;

/**
 * Created by 201 on 2015/6/24.
 */
public class store {
    private String name;
    private String add;
    private int tel;

    public store(String name, String add, int tel) {
        this.name = name;
        this.add = add;
        this.tel = tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
