import model.Cliente.Dependente;
import model.Cliente.Titular;
import model.Conta.Corrente;
import model.Conta.Poupanca;
import service.ClienteService;
import service.ContaService;
import service.PoupancaService;
import service.TitularService;

import javax.swing.*;
import java.time.LocalDate;



public class Main {
    public static double fatorialCalc (int val){
        if(val == 0)
            return 1;
        return fatorialCalc(val-1)*val;
    }
    public static String fatorial (int val){
        if (val < 0)
            return "Nao existe fatorial de numero negativos!";
        return Double.toString(fatorialCalc(val));
    }
    public static void main(String[] args) {
        Titular titular = new Titular("jose");
        Dependente dependente = new Dependente("joao", titular);
        // colocar duas vezes o mesmo dependente (por conta do ID)
        if(!TitularService.addDependente(titular, dependente)) System.out.println("t1: dependente ja inserido! "+dependente.getNome());
        if(!TitularService.addDependente(titular, dependente)) System.out.println("t2: dependente ja inserido! "+dependente.getNome());

        // Nao estou testando datas futuras ou inexistentes nem taxa de juros negativas ou incorretas.
        Poupanca poupanca1 = new Poupanca(30, 1.4);
        Corrente corrente1 = new Corrente();

        // Tentar colocar uma conta poupanca p/ um dependente
        if(!ClienteService.addConta(dependente, corrente1)) System.out.println("t3: dependente com conta corrente!");
        if(!ClienteService.addConta(dependente, poupanca1)) System.out.println("t4: conta com titular! " + poupanca1.getId());
        // Tentar colocar conta duplicada
        if(!ClienteService.addConta(dependente, poupanca1)) System.out.println("t5: conta com titular!" + poupanca1.getId());
        if(!ClienteService.addConta(titular, corrente1)) System.out.println("t6: conta com titular!" + corrente1.getId());
        // Tentar colocar conta duplicada
        if(!ClienteService.addConta(titular, corrente1)) System.out.println("t7: conta com titular!" + corrente1.getId());
        if(!ClienteService.addConta(titular, poupanca1)) System.out.println("t8: conta com titular!" + poupanca1.getId());

        if(!ContaService.depositar(corrente1, 10)) System.out.println("t9: deposito impossivel");
        if(!ContaService.depositar(corrente1, 0)) System.out.println("t10: deposito impossivel");
        if(!ContaService.depositar(corrente1, -1)) System.out.println("t11: deposito impossivel");

        if(!ContaService.sacar(corrente1, 10)) System.out.println("t12: saque impossivel");
        if(!ContaService.sacar(corrente1, 10)) System.out.println("t13: saque impossivel");
        if(!ContaService.sacar(corrente1, 0)) System.out.println("t14: saque impossivel");
        if(!ContaService.sacar(corrente1, -1)) System.out.println("t15: saque impossivel");


        if(!ContaService.depositar(poupanca1, 10)) System.out.println("t16: deposito impossivel");
        // setar data p/ pagamento de juros
        poupanca1.setProxVencimento(LocalDate.now());
        if(!PoupancaService.pagarJuros(poupanca1)) System.out.println("t17: poupanca ainda nao venceu os juros!");
        if(!PoupancaService.pagarJuros(poupanca1)) System.out.println("t18: poupanca ainda nao venceu os juros!");


        System.out.println("\n\nClientes\n");
        System.out.println(titular.toString());
        System.out.println(dependente.toString());
        System.out.println("\n\n");
        System.out.println("Contas\n");
        System.out.println(corrente1.toString());
        System.out.println(poupanca1.toString());


    }
}