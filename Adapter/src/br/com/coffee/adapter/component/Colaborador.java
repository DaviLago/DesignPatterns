package br.com.coffee.adapter.component;

public class Colaborador extends Empregado {

    private String nome;
    private String cargo;

    public Colaborador(String nome,String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCargo() {
        return cargo;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
