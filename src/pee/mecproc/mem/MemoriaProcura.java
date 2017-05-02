package pee.mecproc.mem;

import pee.modprob.Estado;
import java.util.HashMap;
import java.util.Queue;

/**
 *
 */
public class MemoriaProcura {

    protected Queue<No> fronteira;
    protected HashMap<Estado, No> explorados;
    private int nmaxnosfronteira;
    private int nmaxnosexplorados;

    public MemoriaProcura(Queue<No> fronteira){
        this.fronteira = fronteira;
        this.explorados = new HashMap<Estado, No>();
    }

    public void limpar(){
        fronteira.clear();
        explorados.clear();
        //set nmaxnosfronteira = 0
        //set nmaxnosexplorados = 0
    }

    public void inserir(No no){
        //estado actual do no recebido
        Estado estado = no.getEstado();

        No noMemoria = explorados.get(estado);

        if (noMemoria == null ? true : noMemoria.getCusto() > no.getCusto()) {
            fronteira.add(no);
            explorados.put(estado, no);
        }

        if (fronteira.size() > nmaxnosfronteira){
            nmaxnosfronteira = fronteira.size();
        }
        nmaxnosexplorados++;
    }

    public No remover(){
        return fronteira.poll();
    }

    public boolean fronteiraVazia(){
        return fronteira.isEmpty();
    }

    public int getNmaxnosfronteira() {
        return nmaxnosfronteira;
    }

    public void setNmaxnosfronteira(int nmaxnosfronteira) {
        this.nmaxnosfronteira = nmaxnosfronteira;
    }

    public int getNmaxnosexplorados() {
        return nmaxnosexplorados;
    }

    public void setNmaxnosexplorados(int nmaxnosexplorados) {
        this.nmaxnosexplorados = nmaxnosexplorados;
    }
}
