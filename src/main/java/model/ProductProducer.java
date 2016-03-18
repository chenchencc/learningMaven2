package model;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by PBanasiak on 3/18/2016.
 */
public class ProductProducer {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanConfig.xml");

        Product product = (Product) context.getBean("ship");
        //Person person = (Person) context.getBean("JacekManager");
        System.out.println(product);

    }


}
