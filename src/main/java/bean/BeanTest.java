package bean;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.ServletOutputStream;
import java.io.Serializable;

//@ManagedBean
//@Named("beanTest")
//@RequestScoped
public class BeanTest implements Serializable {
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
