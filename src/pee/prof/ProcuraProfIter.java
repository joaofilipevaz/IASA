package pee.prof;

import pee.Solucao;
import pee.modprob.Problema;

/**
 *
 */
public class ProcuraProfIter extends ProcuraProf {

    private int incProf = 1;

    public int getIncProf(){
        return this.incProf;
    }

    public void setIncProf(int incProf){
        this.incProf = incProf;
    }

    private Solucao resolver(Problema problema, int profMax, int incProf){

    }

    public Solucao resolver(Problema problema, int profMax){
        return resolver(problema, profMax, this.getIncProf());
    }
}
