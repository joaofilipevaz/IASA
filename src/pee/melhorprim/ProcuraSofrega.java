package pee.melhorprim;


import pee.No;
import pee.Solucao;
import pee.modprob.ProblemaHeur;

public class ProcuraSofrega extends ProcuraMelhorPrim<ProblemaHeur> implements ProcuraHeur {

    @Override
    protected double f(No no) {
        return 0;
    }

    @Override
    public Solucao resolver(ProblemaHeur problema) {
        return null;
    }

    @Override
    public Solucao resolver(ProblemaHeur problema, int profMax) {
        return null;
    }
}
