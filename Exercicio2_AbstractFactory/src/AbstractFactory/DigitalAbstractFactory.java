package AbstractFactory;

import Executores.ExecutorAbstract;
import Executores.ExecutorDigital;
import Midia.MidiaAbstract;
import Midia.MidiaDigital;

public class DigitalAbstractFactory extends AbstractFactory {

    @Override
    public ExecutorAbstract createExecutor() {
        return new ExecutorDigital();
    }

    @Override
    public MidiaAbstract createMidia() {
        return new MidiaDigital();
    }

}
