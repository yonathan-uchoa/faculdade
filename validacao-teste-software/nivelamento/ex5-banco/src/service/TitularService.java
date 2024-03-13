package service;

import model.Cliente.Dependente;
import model.Cliente.Titular;

public class TitularService {
    public static boolean addDependente(Titular titular, Dependente dependente) {
        if(titular.getDependentes().contains(dependente))
            return false;
        titular.addDependente(dependente);
        return true;
    }
}
