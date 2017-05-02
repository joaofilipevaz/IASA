package pee.melhorprim;

import pee.mecproc.mem.No;
import pee.Procura;
import pee.modprob.Problema;

public class ProcuraCustoUnif extends ProcuraMelhorPrim<Problema> implements Procura {

    protected double f(No no){
        return no.getCusto();
    }
}
