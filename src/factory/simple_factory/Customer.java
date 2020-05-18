package factory.simple_factory;

/**
 * @author fatiaoyezi
 * @version 1.0
 * @date 2020-5-18 10:45
 */
public class Customer  {

    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }


}
