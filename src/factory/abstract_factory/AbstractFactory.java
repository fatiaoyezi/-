package factory.abstract_factory;

/**
 * @author fatiaoyezi
 * @version 1.0
 * @date 2020-5-18 16:36
 */
public interface AbstractFactory {

    //制造发动机
    public Engine createEngine();
    //制造轮胎
    public Tire createTire();
}
