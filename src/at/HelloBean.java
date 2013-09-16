package at;

import javax.faces.bean.*;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {
	// test
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
