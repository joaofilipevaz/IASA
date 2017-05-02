package pee.prof;

import pee.Solucao;
import pee.modprob.Problema;

/**
 *
 */
public class ProcuraProfIter extends ProcuraProf {

    private int incProf = 1;

    public int getIncProf(){
        return incProf;
    }

    public void setIncProf(int incProf){
        this.incProf = incProf;
    }

    private Solucao resolver(Problema problema, int profMax, int incProf){
        for(int profCorrente = incProf; incProf <= profMax; profCorrente += incProf){
            Solucao solucao = super.resolver(problema, profCorrente);
            if(solucao != null){
                return solucao;
            }
        }
        return null;
    }

    public Solucao resolver(Problema problema, int profMax){
        return resolver(problema, profMax, incProf);
    }
}
