package br.com.coffee.adapter.component;

import java.util.List;

public abstract class Empregado {
    
    public void add(Empregado empregado)throws Exception{
        throw new Exception();
    }

    public Empregado get(int i) throws Exception{
        throw new Exception();
    }

    public void remove(Empregado empregado)throws Exception{
        throw new Exception();
    }
    
    public String getNome() throws Exception{
        throw new Exception();
    }

    public void setNome(String nome){}

    public String getCargo()throws Exception {
        throw new Exception();
    }

    public void setCargo(String cargo) throws Exception{
        throw new Exception();
    }

    public List<Empregado> getEmpregados() throws Exception{
        throw new Exception();
    }
    
}
