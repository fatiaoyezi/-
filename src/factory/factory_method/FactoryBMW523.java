package factory.factory_method;

/**
 * @author fatiaoyezi
 * @version 1.0
 * @date 2020-5-18 10:51
 */
public class FactoryBMW523 implements FactoryBMW {
    @Override
    public BMW523 createBMW() {

        return new BMW523();
    }

}

