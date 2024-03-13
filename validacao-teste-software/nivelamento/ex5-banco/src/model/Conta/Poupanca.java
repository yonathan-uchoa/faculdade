package model.Conta;

import java.time.LocalDate;

public class Poupanca extends Conta {
    private LocalDate proxVencimento;
    private int vencimento;
    private double juros;

    public Poupanca(int vencimento, double juros) {
        super();
        this.vencimento = vencimento;
        this.proxVencimento = LocalDate.now().plusDays(vencimento);
        this.juros = juros;
    }

    public LocalDate getProxVencimento() {
        return proxVencimento;
    }

    public void setProxVencimento(LocalDate proxVencimento) {
        this.proxVencimento = proxVencimento;
    }

    public void setProxVencimento(){
        this.proxVencimento = proxVencimento.plusDays(this.vencimento);
    }

    public int getVencimento() {
        return vencimento;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros/10;
    }

    @Override
    public String toString() {
        return "Poupanca{" +
                "proxVencimento=" + proxVencimento +
                ", vencimento=" + vencimento +
                ", juros=" + juros +
                ", id=" + id +
                ", titular=" + titular.getNome() +
                ", extrato=" + extrato +
                ", saldo=" + saldo +
                '}';
    }
}
