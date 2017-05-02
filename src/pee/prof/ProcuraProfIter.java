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
        for(int i = incProf; incProf <= profMax; i += incProf){
            Solucao solucao = super.resolver(problema, i);
            if(solucao != null){
                System.out.println("soluçao");
                return solucao;
            }
        }
        return null;
    }

    public Solucao resolver(Problema problema, int profMax){
        return resolver(problema, profMax, incProf);
    }
}
