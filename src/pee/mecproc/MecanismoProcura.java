package pee.mecproc;

import pee.modprob.Estado;
import pee.modprob.Operador;
import pee.modprob.*;
import pee.mecproc.mem.*;
import pee.*;

public abstract class MecanismoProcura<P extends Problema> {

    private MemoriaProcura memoriaProcura;
    protected P problema;

    public MecanismoProcura() {
        memoriaProcura = iniciarMemoria();
    }

    public Solucao resolver(P problema){
        return resolver(problema, Integer.MAX_VALUE);
    }

    public Solucao resolver(P p, int profMax){
        this.problema = p;
        memoriaProcura.limpar();
        No no_inicial = new No(p.getEstadoInicial());
        memoriaProcura.inserir(no_inicial);
        while (!memoriaProcura.fronteiraVazia()){
            No no = memoriaProcura.remover();
            if (problema.objectivo(no.getEstado())){
                return gerarSolucao(no);
            } else {
                if (no.getProfundidade() < profMax){
                    expandir(no);
                }
            }
        }
        return null;
    }

    private void expandir(No no){
        Estado estado = no.getEstado();
        Operador[] operadores = problema.getOperadores();
        for (Operador op : operadores) {
            Estado estadoSuc = op.aplicar(estado);
            if (estadoSuc!=null){
                No noSuc = new No(estadoSuc, op, no);
                memoriaProcura.inserir(noSuc);
            }
        }
    }

    private Solucao gerarSolucao(No noFinal){
        Percurso percurso = new Percurso();
        No no = noFinal;
        while (no != null){
            percurso.juntarInicio(no);
            no = no.getAntecessor();
        }
        return percurso;
    }

    protected abstract MemoriaProcura iniciarMemoria();
}
