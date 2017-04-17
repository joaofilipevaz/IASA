package pee.melhorprim;

import pee.No;
import pee.Procura;
import pee.modprob.Problema;

public class ProcuraCustoUnif extends ProcuraMelhorPrim<Problema> implements Procura {

    protected double f(No no){
        return no.getCusto();
    }
}
