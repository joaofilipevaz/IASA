package plantraj.modprob;

import pee.modprob.Estado;
import pee.modprob.Problema;
import java.util.ArrayList;

public class ProblemaPlanTRaj extends Problema {

    private Estado estadoFinal;

    public ProblemaPlanTRaj(String locIni, String locFin, ArrayList<OperadorLigacao> operadores){
        super();
    }

    public boolean objectivo(Estado estado){
        return false;
    }
}
