package factory.simple_factory;

/**
 * @author fatiaoyezi
 * @version 1.0
 * @date 2020-5-18 10:45
 */
public class Factory {

    public BMW createBMW(int type) {
        switch (type) {

            case 320:
                return new BMW320();

            case 523:
                return new BMW523();

            default:
                break;
        }
        return null;
    }

}
