import pee.modprob.Estado;
import pee.modprob.Operador;

/**
 * Created by Mónica on 27/03/2017.
 */
public class No {

    private int profundidade = 0;
    private double custo = 0.0;

    public No(Estado estado){

    }

    public No(Estado estado, Operador operador, No antecessor){

    }

    public Estado getEstado(){

        return null;
    }

    public Operador getOperador(){

        return null;
    }

    public No getAntecessor(){

        return null;
    }

    public int getProfundidade(){

        return 0;
    }

    public double getCusto(){

        return 0;
    }
}