package plantraj.modprob;

import pee.modprob.Estado;
import pee.modprob.Problema;

public class ProblemaPlanTRaj extends Problema {

    private EstadoLocalidade estadoFinal;

    public ProblemaPlanTRaj(String locIni, String locFin, OperadorLigacao[] operadores){
        super(new EstadoLocalidade(locIni), operadores);
        estadoFinal = new EstadoLocalidade(locFin);
    }

    public boolean objectivo(Estado estado){
        return estadoFinal.equals(estado);
    }
}
