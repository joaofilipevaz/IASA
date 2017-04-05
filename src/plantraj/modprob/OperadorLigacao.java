package plantraj.modprob;

import pee.modprob.Estado;
import pee.modprob.Operador;

public class OperadorLigacao implements Operador {

    private Estado estadoOrigem;
    private Estado estadoDestino;
    private int custoLigacao;

    public OperadorLigacao(String locIni, String locFin, int custo){

    }

    @Override
    public Estado aplicar(Estado estado) {
        return null;
    }

    @Override
    public float custo(Estado estado, Estado estadoSuc) {
        return 0;
    }
}
