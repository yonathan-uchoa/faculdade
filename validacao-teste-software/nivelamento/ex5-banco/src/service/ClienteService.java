package service;

import model.Cliente.Cliente;
import model.Conta.Conta;

public class ClienteService {
    public static boolean addConta(Cliente cliente, Conta conta){
        if(conta.getTitular() != null)
            return false;
        if(!cliente.addConta(conta)){
            conta = null;
            return false;
        }
        conta.setTitular(cliente);
        return true;
    }
}
