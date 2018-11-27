/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Executores;

import Midia.MidiaAbstract;

/**
 *
 * @author cce-teste11
 */
public class ExecutorDigital  extends ExecutorAbstract {

    @Override
    public String executar(MidiaAbstract midia) {
        System.out.println("Executor Digital executando: " + midia.getClass().getSimpleName());
        return "Executor Digital executando: " + midia.getClass().getSimpleName();
    }
    
}
