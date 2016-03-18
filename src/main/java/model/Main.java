package model;

import model.Factory;

/**
 * Created by PBanasiak on 3/17/2016.
 */
public class Main {

    public static void main(String [] args){

        Factory factory = new Factory();
        Product toy = new Product("Toy",1);
        Product ship = new Product("Ship",2);

        factory.addProduct(toy);
        factory.addProduct(ship);

        System.out.print(factory.getListOfAvailableProducts());
    }

}
