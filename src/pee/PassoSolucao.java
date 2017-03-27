package pee;

import pee.modprob.Estado;
import pee.modprob.Operador;

/**
 * Created by Mónica on 27/03/2017.
 */
public interface PassoSolucao {

    public Estado getEstado();

    public Operador getOperator();

    public double getCusto();
}
