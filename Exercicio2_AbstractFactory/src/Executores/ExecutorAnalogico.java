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
public class ExecutorAnalogico extends ExecutorAbstract {

    @Override
    public String executar(MidiaAbstract midia) {
        System.out.println("Executor Analógico executando: " + midia.getClass().getSimpleName());
        return "Executor Analógico executando: " + midia.getClass().getSimpleName();
    }
    
}
