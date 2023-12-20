package vehicle;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean()
@RequestScoped
public class Car {
    private String name = "Vinfast Lux SA 2.0";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car() {
        System.out.println("xxxxxxxxxxxxxxxxxx");
    }
}
