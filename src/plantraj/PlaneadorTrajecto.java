package plantraj;

import pee.PassoSolucao;
import pee.Procura;
import pee.Solucao;
import pee.larg.ProcuraLarg;
import pee.prof.ProcuraProf;
import pee.prof.ProcuraProfIter;
import plantraj.modprob.OperadorLigacao;
import plantraj.modprob.ProblemaPlanTRaj;

public class PlaneadorTrajecto {

    public void main(String[] args){
        OperadorLigacao[] operadores = definirOperadores();
        ProblemaPlanTRaj problema = new ProblemaPlanTRaj("0", "4", operadores);

        Procura mecProcura = new ProcuraProf();
        System.out.println("Procura em Profundidade:");
        Solucao solucao = mecProcura.resolver(problema);
        mostrarTrajecto(solucao);
        System.out.println("=========================");

        mecProcura = new ProcuraProfIter();
        System.out.println("Procura em Profundidade Iterativa:");
        solucao = mecProcura.resolver(problema);
        mostrarTrajecto(solucao);
        System.out.println("=========================");

        mecProcura = new ProcuraLarg();
        System.out.println("ProcuraLarg:");
        solucao = mecProcura.resolver(problema);
        mostrarTrajecto(solucao);
        System.out.println("=========================");
    }

    private OperadorLigacao[] definirOperadores(){

        return new OperadorLigacao[]{
                new OperadorLigacao("Loc-0","Loc-2",25),
                new OperadorLigacao("Loc-0","Loc-1",5),
                new OperadorLigacao("Loc-1","Loc-3",12),
                new OperadorLigacao("Loc-1","Loc-6",5),
                new OperadorLigacao("Loc-2","Loc-4",30),
                new OperadorLigacao("Loc-3","Loc-2",10),
                new OperadorLigacao("Loc-3","Loc-5",5),
                new OperadorLigacao("Loc-4","Loc-3",2),
                new OperadorLigacao("Loc-5","Loc-6",8),
                new OperadorLigacao("Loc-5","Loc-4",10),
                new OperadorLigacao("Loc-6","Loc-3",15)
        };
    }

    private void mostrarTrajecto(Solucao solucao){
        if (solucao == null){
            for (PassoSolucao ps : solucao) {
                System.out.printf("estado: %s - custo: %s \n",ps.getEstado(), ps.getCusto());
            }
        }
    }
}