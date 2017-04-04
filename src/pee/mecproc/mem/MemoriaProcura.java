package pee.mecproc.mem;

import pee.No;
import java.util.Queue;

/**
 *
 */
public class MemoriaProcura {

    protected Queue<No> fronteira;
    protected Queue<No> explorados;

    public MemoriaProcura(Queue<No> fronteira){

    }

    public void limpar(){
        fronteira.clear();

    }

    public void inserir(No no){
        fronteira.add(no);

    }

    public No remover(){
        return fronteira.remove();
    }

    public boolean fronteiraVazia(){
        return fronteira.isEmpty();
    }
}
