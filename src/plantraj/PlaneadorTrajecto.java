package plantraj;

import pee.PassoSolucao;
import pee.Procura;
import pee.Solucao;
import pee.larg.ProcuraLarg;
import pee.prof.ProcuraProf;
import pee.prof.ProcuraProfIter;
import plantraj.modprob.OperadorLigacao;
import plantraj.modprob.ProblemaPlanTraj;

public class PlaneadorTrajecto {

    public static void main(String[] args){
        OperadorLigacao[] operadores = definirOperadores();
        ProblemaPlanTraj problema = new ProblemaPlanTraj("0", "4", operadores);

//        Procura mecProcura = new ProcuraProf();
//        System.out.println("Procura em Profundidade:");
//        Solucao solucao = mecProcura.resolver(problema);
//        mostrarTrajecto(solucao);
//        System.out.println("=========================");

        Procura mecProcura = new ProcuraProfIter();
        System.out.println("Procura em Profundidade Iterativa:");
        Solucao solucao = mecProcura.resolver(problema, 5);
        mostrarTrajecto(solucao);
        System.out.println("=========================");

        mecProcura = new ProcuraLarg();
        System.out.println("ProcuraLarg:");
        solucao = mecProcura.resolver(problema);
        mostrarTrajecto(solucao);
        System.out.println("=========================");
    }

    private static OperadorLigacao[] definirOperadores(){

        return new OperadorLigacao[]{
                new OperadorLigacao("Loc-0","Loc-1",25),
                new OperadorLigacao("Loc-0","Loc-2",5),
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

    private static void mostrarTrajecto(Solucao solucao){
        if (solucao != null){
            for (PassoSolucao ps : solucao) {
                System.out.printf("estado: %s - custo: %s \n",ps.getEstado(), ps.getCusto());
            }
        }
    }
}