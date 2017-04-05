package pee.melhorprim;

import pee.Solucao;
import pee.modprob.ProblemaHeur;

public interface ProcuraHeur {

    Solucao resolver(ProblemaHeur problema);

    Solucao resolver(ProblemaHeur problema, int profMax);
}
