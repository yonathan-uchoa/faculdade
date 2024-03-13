package model.Aplicacao;

import java.time.LocalDate;

public class Aplicacao {
    private LocalDate prazo;
    private double juros;
    private double valorAplicado;

    public Aplicacao(String prazo, double juros, double valorAplicado) {
        this.prazo = LocalDate.parse(prazo);
        this.juros = juros;
        this.valorAplicado = valorAplicado;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = LocalDate.parse(prazo);
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }
}
