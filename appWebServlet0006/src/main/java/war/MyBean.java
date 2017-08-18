package war;




import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by SETICOV on 17.08.2017.
 */
@Named
@SessionScoped
public class MyBean implements Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(this.name);
    }
}
