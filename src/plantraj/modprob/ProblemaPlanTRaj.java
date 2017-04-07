package plantraj.modprob;

import pee.modprob.Estado;
import pee.modprob.Problema;
import java.util.ArrayList;

public class ProblemaPlanTRaj extends Problema {

    private EstadoLocalidade estadoFinal;

    public ProblemaPlanTRaj(String locIni, String locFin, ArrayList<OperadorLigacao> operadores){
        super(new EstadoLocalidade(locIni), operadores);
        estadoFinal = new EstadoLocalidade(locFin);
    }

    public boolean objectivo(Estado estado){
        return estadoFinal.equals(estado);
    }
}
