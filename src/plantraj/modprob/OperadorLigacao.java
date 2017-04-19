package plantraj.modprob;

import pee.modprob.Estado;
import pee.modprob.Operador;

public class OperadorLigacao implements Operador {

    private EstadoLocalidade estadoDestino, estadoOrigem;
    private int custoLigacao;

    public OperadorLigacao(String locIni, String locFin, int custo){
        estadoOrigem = new EstadoLocalidade(locIni);
        estadoDestino = new EstadoLocalidade(locFin);
        custoLigacao = custo;
    }

    @Override
    public Estado aplicar(Estado estado) {
        if (estadoOrigem.equals(estado)){
            return estadoDestino;
        }
        return null;
    }

    @Override
    public float custo(Estado estado, Estado estadoSuc) {
        return custoLigacao;
    }
}
