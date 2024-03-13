package model;

public abstract class Empregado extends Pessoa {
    protected double salario;
    protected String setor;

    public Empregado() {
    }

    public Empregado(String nome, double salario, String cpf, String setor) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

}
