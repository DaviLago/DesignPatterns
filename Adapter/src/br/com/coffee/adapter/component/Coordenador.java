package br.com.coffee.adapter.component;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Empregado {
    private String nome;
    private String cargo;
    private List<Empregado> empregados;

    public Coordenador() {
        this.empregados = new ArrayList<>();
    }

    public Coordenador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.empregados = new ArrayList<>();
    }

    @Override
    public List<Empregado> getEmpregados() {
        return empregados;
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

    public int size() {
        return empregados.size();
    }

    @Override
    public void add(Empregado empregado) {
        empregados.add(empregado);
    }

    @Override
    public Empregado get(int i) {
        return empregados.get(i);
    }

    @Override
    public void remove(Empregado empregado) {
        empregados.remove(empregado);
    }

}
