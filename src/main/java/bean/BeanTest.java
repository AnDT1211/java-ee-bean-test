package bean;

import java.io.Serializable;

public class BeanTest {
    String name;

    public BeanTest() {
        name = "Mr. Bean !!!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
