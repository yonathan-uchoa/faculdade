package model.Conta;

import model.Aplicacao.Aplicacao;

import java.util.ArrayList;

public class Corrente extends Conta{

    private ArrayList<Aplicacao> aplicacoes = new ArrayList<>();

    public Corrente() {
        super();
    }



    @Override
    public String toString() {
        return "Corrente{" +
                "id=" + id +
                ", titular=" + titular.getNome() +
                ", extrato=" + extrato +
                ", saldo=" + saldo +
                '}';
    }
}
