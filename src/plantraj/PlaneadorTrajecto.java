package plantraj;

import pee.PassoSolucao;
import pee.Procura;
import pee.Solucao;
import pee.larg.ProcuraLarg;
import pee.melhorprim.ProcuraAA;
import pee.melhorprim.ProcuraCustoUnif;
import pee.melhorprim.ProcuraHeur;
import pee.melhorprim.ProcuraSofrega;
import pee.prof.ProcuraProf;
import pee.prof.ProcuraProfIter;
import plantraj.modprob.OperadorLigacao;
import plantraj.modprob.ProblemaPlanTraj;

public class PlaneadorTrajecto {

    public static void main(String[] args){
        OperadorLigacao[] operadores = definirOperadores();
        ProblemaPlanTraj problema = new ProblemaPlanTraj("0", "4", operadores);

        //Procura em Profundidade
        Procura mecProcura = new ProcuraProf();
        System.out.println("Procura em Profundidade:");
        Solucao solucao = mecProcura.resolver(problema);
        mostrarTrajecto(solucao);
        System.out.println("=========================");

        //Procura em Profundidade Iterativa
        mecProcura = new ProcuraProfIter();
        System.out.println("Procura em Profundidade Iterativa:");
        solucao = mecProcura.resolver(problema, 5);
        mostrarTrajecto(solucao);
        System.out.println("=========================");

        //Procura em Largura
        mecProcura = new ProcuraLarg();
        System.out.println("ProcuraLarg:");
        solucao = mecProcura.resolver(problema);
        mostrarTrajecto(solucao);
        System.out.println("=========================");

        mecProcura = new ProcuraCustoUnif();
        System.out.println("ProcuraCustoUnif:");
        solucao = mecProcura.resolver(problema);
        mostrarTrajecto(solucao);
        System.out.println("=========================");

    }

    private static OperadorLigacao[] definirOperadores(){

        return new OperadorLigacao[]{
                new OperadorLigacao("0","1",5),
                new OperadorLigacao("0","2",25),
                new OperadorLigacao("1","3",12),
                new OperadorLigacao("1","6",5),
                new OperadorLigacao("2","4",30),
                new OperadorLigacao("3","2",10),
                new OperadorLigacao("3","5",5),
                new OperadorLigacao("4","3",2),
                new OperadorLigacao("5","6",8),
                new OperadorLigacao("5","4",10),
                new OperadorLigacao("6","3",15)
        };
    }

    private static void mostrarTrajecto(Solucao solucao){
        if (solucao != null){
            System.out.println("soluçao");
            for (PassoSolucao ps : solucao) {
                System.out.printf("estado: %s - custo: %s \n",ps.getEstado(), ps.getCusto());
            }
        }
    }
}