package factory.factory_method;

/**
 * @author fatiaoyezi
 * @version 1.0
 * @date 2020-5-18 10:51
 */
public class Customer {

    public static void main(String[] args) {

        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        BMW320 bmw320 = factoryBMW320.createBMW();

        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        BMW523 bmw523 = factoryBMW523.createBMW();
    }

}
