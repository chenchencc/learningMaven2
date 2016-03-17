import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PBanasiak on 3/17/2016.
 */
public class TestProduct {
   private Product product;

    @Test
    public void testCountSerialNumberShouldReturn10(){
        product=new Product("Computer",1);
        assertEquals(product.countSerialNumber(product.getId()), 10);

    }
    /*
    @Test
    public void testCountSerialNumberShouldNotBeSuccess(){
        product=new Product("Computer",1);
        assertEquals(product.countSerialNumber(product.getId()), 20);

    }
    */
}
