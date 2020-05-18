package factory.abstract_factory;

/**
 * @author fatiaoyezi
 * @version 1.0
 * @date 2020-5-18 16:40
 */
public class Customer {

    public static void main(String[] args){
        //生产宝马320系列配件
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createTire();

        //生产宝马523系列配件
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW523.createEngine();
        factoryBMW523.createTire();
    }

}
