package model.Conta;

import model.Cliente.Cliente;

import java.util.ArrayList;
import java.util.UUID;

public abstract class Conta {
    protected UUID id;
    protected Cliente titular;
    protected ArrayList<String> extrato = new ArrayList<>();
    protected double saldo = 0;

    public Conta() {
        this.id = UUID.randomUUID();
    }

    public void addExtrato(String extrato){
        this.extrato.add(extrato);
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public ArrayList<String> getExtrato() {
        return extrato;
    }

    public void setExtrato(ArrayList<String> extrato) {
        this.extrato = extrato;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public UUID getId() {
        return id;
    }
}
