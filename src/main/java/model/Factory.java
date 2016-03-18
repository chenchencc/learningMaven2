package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PBanasiak on 3/17/2016.
 */
public class Factory {



    private List<Product> listOfAvailableProducts;

    public Factory(){
        listOfAvailableProducts=new ArrayList<Product>();
    }

    public void addProduct(Product product){
        listOfAvailableProducts.add(product);
       // listOfAvailableProducts.forEach(a->System.out.print(a));
    }

    public List<Product> getListOfAvailableProducts() {
        return listOfAvailableProducts;
    }

    @Override
    public String toString() {
        return "ListOfAvailableProducts=" + listOfAvailableProducts;
    }
}
