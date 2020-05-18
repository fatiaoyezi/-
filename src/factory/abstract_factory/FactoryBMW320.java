package factory.abstract_factory;

/**
 * @author fatiaoyezi
 * @version 1.0
 * @date 2020-5-18 16:39
 */
public class FactoryBMW320 implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineA();

    }

    @Override
    public Tire createTire() {
        return new TireA();
    }
}
