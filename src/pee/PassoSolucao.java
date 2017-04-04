package pee;

import pee.modprob.Estado;
import pee.modprob.Operador;

/**
 * Interface que implementa um passo para a solução que corresponde um nó
 */
public interface PassoSolucao {

    Estado getEstado();

    Operador getOperador();

    double getCusto();
}
