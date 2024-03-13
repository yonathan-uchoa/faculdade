package model.Cliente;

import model.Conta.Conta;

import java.util.ArrayList;
import java.util.UUID;

public class Titular extends Cliente{
    private ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
    public Titular(String nome, ArrayList<Conta> contas) {
        super();
        this.nome = nome;
        this.contas = contas;
    }
    public Titular(String nome) {
        super();
        this.nome = nome;
    }

    @Override
    public boolean addConta(Conta conta) {
        this.contas.add(conta);
        return true;
    }
    public void addDependente(Dependente dependente){
        this.dependentes.add(dependente);
    }
    public ArrayList<Dependente> getDependentes() {
        return dependentes;
    }
    public void setDependentes(ArrayList<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    private String showDependentes() {
        StringBuilder dep = new StringBuilder();
        dependentes.forEach(el -> {
            dep.append(el.getNome());
        });
        return dep.toString();
    }

    @Override
    public String toString() {
        return "Titular{" +
                "dependentes=" + showDependentes() +
                ", nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}
