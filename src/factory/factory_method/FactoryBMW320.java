package factory.factory_method;

/**
 * @author fatiaoyezi
 * @version 1.0
 * @date 2020-5-18 10:50
 */
public class FactoryBMW320 implements FactoryBMW {
    @Override
    public BMW320 createBMW() {
        return new BMW320();
    }
}
