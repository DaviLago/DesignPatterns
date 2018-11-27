package Main;

import AbstractFactory.AbstractFactory;
import AbstractFactory.AnalogicoAbstractFactory;
import AbstractFactory.DigitalAbstractFactory;
import View.JFrameTeste;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AbstractFactory factoryAnalogica = new AnalogicoAbstractFactory();
        factoryAnalogica.createExecutor().executar(factoryAnalogica.createMidia());
        
        AbstractFactory factoryDigital = new DigitalAbstractFactory();
        factoryDigital.createExecutor().executar(factoryDigital.createMidia());
        
        JFrameTeste.main(args);
        
    }
    
}
