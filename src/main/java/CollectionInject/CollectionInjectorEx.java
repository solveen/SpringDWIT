package CollectionInject;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionInjectorEx {

    private String name;
    private List<String> address;
    private Set<String> location;
    private Map<String, String> college;

    public CollectionInjectorEx(String name, List<String> address, Set<String> location, Map<String,String> college){
        this.name = name;
        this.address = address;
        this.college = college;
        this.location = location;
        System.out.println("This is calling from constructor");
    }

    public CollectionInjectorEx(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
        System.out.println("Calling from setter");
    }

    public Set<String> getLocation() {
        return location;
    }

    public void setLocation(Set<String> location) {
        this.location = location;
    }

    public Map<String, String> getCollege() {
        return college;
    }

    public void setCollege(Map<String, String> college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "CollectionInjector{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", location=" + location +
                ", college=" + college +
                '}';
    }
}
