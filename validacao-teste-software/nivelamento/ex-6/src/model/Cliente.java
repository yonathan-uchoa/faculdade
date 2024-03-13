package model;

public class Cliente extends Pessoa{
    private double saldo;
    private String email;

    public Cliente(String nome, String cpf, double saldo, String email) {
        super(nome, cpf);
        this.saldo = saldo;
        this.email = email;
    }

    public Cliente() {
        super();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void exibirDados() {
        // implements...
    }
}
