package service;

import model.Conta.Conta;

import java.time.LocalDateTime;

public class ContaService {
    public static String gerarExtrato(double valor, String operacao) {
        StringBuilder _extrato = new StringBuilder();
        if(operacao.equals("saque"))
            _extrato.append("Valor ").append(Math.abs(valor)).append(" sacado em: ").append(LocalDateTime.now());
        else if(operacao.equals("deposito"))
            _extrato.append("Valor ").append(valor).append(" depositado em: ").append(LocalDateTime.now());
        else if(operacao.equals("juros"))
            _extrato.append("Valor: ").append(valor).append(" de juros pagos em: ").append(LocalDateTime.now());
        return _extrato.toString();
    }

    public static boolean sacar(Conta conta, double valor) {
        double _saldo = conta.getSaldo();
        if(_saldo <= 0 || _saldo < valor || valor <= 0)
            return false;
        _saldo -= valor;
        conta.setSaldo(_saldo);
        conta.addExtrato(gerarExtrato(valor, "saque"));
        return true;
    }

    public static boolean depositar(Conta conta, double valor) {
        double _saldo = conta.getSaldo();
        if(valor <= 0)
            return false;
        _saldo += valor;
        conta.setSaldo(_saldo);
        conta.addExtrato(gerarExtrato(valor, "deposito"));
        return true;
    }
}
