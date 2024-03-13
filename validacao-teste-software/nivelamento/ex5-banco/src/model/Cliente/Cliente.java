package model.Cliente;

import model.Conta.Conta;

import java.util.ArrayList;
import java.util.UUID;

public abstract class Cliente {
    protected UUID id;
    protected String nome = "";
    protected ArrayList<Conta> contas = new ArrayList<>();

    public Cliente() {
        this.id = UUID.randomUUID();
    }

    public abstract boolean addConta(Conta conta);

    public void setContas(ArrayList<Conta> contas){
        this.contas = contas;
    }
    public ArrayList<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }
}
