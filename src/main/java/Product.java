/**
 * Created by PBanasiak on 3/17/2016.
 */
public class Product {

    private String name;
    private int id;
    private int serialNumber;


    public int getId() {
        return id;
    }

    public String getName() {

        return name;
    }

    public Product(String name, int id){
        this.name=name;
        this.id=id;
        this.serialNumber=countSerialNumber(id);


    }

    public int countSerialNumber(int id){

        return id*10;
    }

    @Override
    public String toString() {
        return "Product:" +
                "name='" + name + '\'' +
                ", id=" + id +
                ';';
    }
}
