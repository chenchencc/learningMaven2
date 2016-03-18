package model;

/**
 * Created by PBanasiak on 3/17/2016.
 */
public class Product {


    private int id;
    private int serialNumber;
    private String name;

    public Product() {
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
