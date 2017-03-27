package pee.modprob;

import pee.modprob.Estado;

/**
 * Created by Mónica on 27/03/2017.
 */
public interface Operador {

    public Estado aplicar(Estado estado);

    public float custo(Estado estado, Estado estadoSuc);

}

