package pee.modprob;

import java.util.ArrayList;

/**
 *
 */
public abstract class ProblemaHeur extends Problema {

    public ProblemaHeur(Estado estadoInicial, ArrayList<Operador> operadores){
        super(estadoInicial, operadores);
    }

    public abstract double heuristica(Estado estado);
}
