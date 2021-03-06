package pee.melhorprim;

import pee.mecproc.mem.No;
import pee.mecproc.MecanismoProcura;
import pee.mecproc.mem.MemoriaPrioridade;
import pee.mecproc.mem.MemoriaProcura;
import pee.modprob.Problema;

import java.util.Comparator;

/**
 *
 */
public abstract class ProcuraMelhorPrim<P extends Problema> extends MecanismoProcura<P> implements Comparator<No> {

    protected MemoriaProcura iniciarMemoria(){
        return new MemoriaPrioridade(this);
    }

    public int compare(No o1, No o2){
        return Double.compare(f(o1),f(o2));
    }

    protected abstract double f(No no);
}
