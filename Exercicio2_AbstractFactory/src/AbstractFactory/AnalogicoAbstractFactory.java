package AbstractFactory;

import Executores.ExecutorAbstract;
import Executores.ExecutorAnalogico;
import Midia.MidiaAbstract;
import Midia.MidiaAnalogica;

public class AnalogicoAbstractFactory extends AbstractFactory {

    @Override
    public ExecutorAbstract createExecutor() {
        return new ExecutorAnalogico();
    }

    @Override
    public MidiaAbstract createMidia() {
        return new MidiaAnalogica();
    }
 
}
