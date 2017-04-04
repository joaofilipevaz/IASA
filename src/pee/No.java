package pee;

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
        this.profundidade = antecessor.getProfundidade() +1;
        this.custo = antecessor.getCusto() + operador.custo(antecessor.getEstado(), this.estado);
    }

    public Estado getEstado(){
        return this.estado;
    }

    @Override
    public Operador getOperador() {
        return this.operador;
    }

    public No getAntecessor(){
        return this.antecessor;
    }

    public int getProfundidade(){
        return this.profundidade;
    }

    public double getCusto(){
        return this.custo;
    }
}