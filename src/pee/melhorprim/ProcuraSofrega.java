package pee.melhorprim;


import pee.mecproc.mem.No;
import pee.modprob.ProblemaHeur;

public class ProcuraSofrega extends ProcuraMelhorPrim<ProblemaHeur> implements ProcuraHeur{

    @Override
    protected double f(No no) {
        return problema.heuristica(no.getEstado());
    }
}
