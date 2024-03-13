package model.Cliente;

import model.Conta.Conta;
import model.Conta.Corrente;

import java.util.UUID;

public class Dependente extends Cliente{
    private Titular responsavel;

    // Um dependente possui obrigatoriamente um titular, independente de ter conta ou nao.
    public Dependente(String nome, Titular responsavel) {
        super();
        this.nome = nome;
        this.responsavel = responsavel;
    }


    @Override
    public boolean addConta(Conta conta){
        if(conta instanceof Corrente)
            return false;
        this.contas.add(conta);
        return true;
    }

    @Override
    public String toString() {
        return "Dependente{" +
                "responsavel=" + responsavel.nome +
                ", nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}
