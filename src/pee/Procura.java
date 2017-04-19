package pee;

import pee.modprob.Problema;

public interface Procura {

    Solucao resolver(Problema problema);

    Solucao resolver(Problema problema, int profMax);
}
