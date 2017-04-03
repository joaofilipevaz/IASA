package pee.mecproc;

import pee.modprob.Estado;
import pee.modprob.Operador;
import pee.modprob.*;
import pee.mecproc.mem.*;
import pee.*;

public abstract class MecanismoProcura<P extends Problema> {

    private MemoriaProcura memoria_procura;
    private P problema;
    private Percurso percurso;
    //private pee.No no_inicial;

    public MecanismoProcura() {
        this.memoria_procura = new MemoriaProcura();
    }

    public Solucao resolver(Problema problema){
        int profmax = Integer.MAX_VALUE;
        return resolver(problema, profmax);
    }

    public Solucao resolver(Problema p, int profmax){
        this.problema = problema;
        this.memoria_procura.limpar();
        No no_inicial = new No(p.getEstadoInicial());
        this.memoria_procura.inserir(no_inicial);
        while (!memoria_procura.fronteiraVazia()){
            No no = memoria_procura.remover();
            if (problema.objectivo(no.getEstado())){
                return gerarSolucao(no);
            } else {
                if (no.getProfundidade() < profmax){
                    expandir(no);
                }
            }
        }
        return null;
    }

    private void expandir(No no){
        Estado estado = no.getEstado();
        Operador[] operadores = this.problema.getOperadores();
        for (Operador op : operadores) {
            Estado estadoSuc = op.aplicar(estado);
            if (estadoSuc!=null){
                No noSuc = new No(estadoSuc, op, no);
                memoria_procura.inserir(noSuc);
            }
        }
    }

    private Solucao gerarSolucao(No noFinal){
        percurso = new Percurso();
        No no = noFinal;
        while (no != null){
            percurso.juntarInicio(no);
            No antecessor = no.getAntecessor();
            no = antecessor;
        }
        return percurso;
    }
}
