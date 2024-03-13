package service;

import model.Conta.Poupanca;
import java.time.LocalDate;

public class PoupancaService{
    public static boolean pagarJuros(Poupanca conta) {
        LocalDate _hoje = LocalDate.now();
        if(_hoje.isBefore(conta.getProxVencimento()))
            return false;
        double _saldo = conta.getSaldo();
        _saldo+= _saldo * conta.getJuros()/10;
        double _jurosPagos = _saldo - conta.getSaldo();
        conta.setSaldo(_saldo);
        conta.setProxVencimento();
        conta.addExtrato(ContaService.gerarExtrato(_jurosPagos, "juros"));
        return true;
    }
}
