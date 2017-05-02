package pee.mecproc.mem;

import pee.PassoSolucao;
import pee.modprob.Estado;
import pee.modprob.Operador;


public class No implements PassoSolucao {

    private Estado estado;
    private Operador operador;
    private No antecessor;
    private int profundidade = 0;
    private double custo = 0.0;

    public No(Estado estado){
        this.estado = estado;
    }

    public No(Estado estado, Operador operador, No antecessor){
        this(estado);
        this.operador = operador;
        this.antecessor = antecessor;
        if (antecessor != null){
            this.profundidade = antecessor.getProfundidade() +1;
            this.custo = antecessor.getCusto() + operador.custo(antecessor.getEstado(), estado);
        } else if (antecessor == null) {
            profundidade = 0;
            custo = 0;
        }
    }

    public Estado getEstado(){
        return estado;
    }

    @Override
    public Operador getOperador() {
        return operador;
    }

    public No getAntecessor(){
        return antecessor;
    }

    public int getProfundidade(){
        return profundidade;
    }

    public double getCusto(){
        return custo;
    }
}