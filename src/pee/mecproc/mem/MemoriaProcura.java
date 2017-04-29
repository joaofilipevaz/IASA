package pee.mecproc.mem;

import pee.No;
import pee.modprob.Estado;

import java.util.HashMap;
import java.util.Queue;

/**
 *
 */
public class MemoriaProcura {

    protected Queue<No> fronteira;
    protected HashMap<Estado, No> explorados;

    public MemoriaProcura(Queue<No> fronteira){
        this.fronteira = fronteira;
        this.explorados = new HashMap<>();
    }

    public void limpar(){
        fronteira.clear();
        explorados.clear();
    }

    public void inserir(No no){
        fronteira.add(no);
        Estado estado = no.getEstado();
        No noMemoria = explorados.get(estado);
        if ((noMemoria == null) || (noMemoria.getCusto() > no.getCusto())) {
            explorados.put(no.getEstado(), no);
            System.out.println("insere");
        }
    }

    public No remover(){
        return fronteira.poll();
    }

    public boolean fronteiraVazia(){
        return fronteira.isEmpty();
    }
}
