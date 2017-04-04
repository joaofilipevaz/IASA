package pee;

import pee.modprob.Problema;

public interface Procura {

    public Solucao resolver(Problema problema);

    public Solucao resolver(Problema problema, int profMax);
}
