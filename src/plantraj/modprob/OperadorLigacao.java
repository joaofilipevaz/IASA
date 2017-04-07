package plantraj.modprob;

import pee.modprob.Estado;
import pee.modprob.Operador;

public class OperadorLigacao implements Operador {

    private EstadoLocalidade estadoOrigem;
    private EstadoLocalidade estadoDestino;
    private int custoLigacao;

    public OperadorLigacao(String locIni, String locFin, int custo){
        this.estadoOrigem = new EstadoLocalidade(locIni);
        this.estadoDestino = new EstadoLocalidade(locFin);
        this.custoLigacao = custo;
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
