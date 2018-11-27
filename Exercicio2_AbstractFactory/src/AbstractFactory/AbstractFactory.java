package AbstractFactory;

import Executores.ExecutorAbstract;
import Midia.MidiaAbstract;

public abstract class AbstractFactory {
    
    public abstract ExecutorAbstract createExecutor();
    public abstract MidiaAbstract createMidia();
    
}
