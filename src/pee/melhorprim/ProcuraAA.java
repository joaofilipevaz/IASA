package pee.melhorprim;

import pee.mecproc.mem.No;
import pee.modprob.ProblemaHeur;

public class ProcuraAA extends ProcuraMelhorPrim<ProblemaHeur> implements ProcuraHeur {

    @Override
    protected double f(No no) {
        return no.getCusto() + problema.heuristica(no.getEstado());
    }
}
