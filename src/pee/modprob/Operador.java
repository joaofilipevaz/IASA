package pee.modprob;

/**
 *
 */
public interface Operador {

    Estado aplicar(Estado estado);

    float custo(Estado estado, Estado estadoSuc);

}

