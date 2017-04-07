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
        ProblemaPlanTRaj problema = new ProblemaPlanTRaj("0", "4", );

        Procura mecProcura = new ProcuraProf();
        System.out.println("ProcuraProf:");
        Solucao solucao = mecProcura.resolver(problema);
        mostrarTrajecto(solucao);
        System.out.println("=========================");

        mecProcura = new ProcuraProfIter();
        System.out.println("ProcuraProfIter:");
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
        OperadorLigacao[] operadores = new OperadorLigacao[11];
        operadores[0] = new OperadorLigacao("0", "1", 5);
        operadores[1] = new OperadorLigacao("0", "2", 25);
        operadores[2] = new OperadorLigacao("1", "3", 12);
        operadores[3] = new OperadorLigacao("1", "6", 5);
        operadores[4] = new OperadorLigacao("2", "4", 30);
        operadores[5] = new OperadorLigacao("3", "2", 10);
        operadores[6] = new OperadorLigacao("3", "5", 5);
        operadores[7] = new OperadorLigacao("4", "3", 2);
        operadores[8] = new OperadorLigacao("5", "6", 8);
        operadores[9] = new OperadorLigacao("5", "4", 10);
        operadores[10] = new OperadorLigacao("6", "3", 15);
        return operadores;
    }

    private void mostrarTrajecto(Solucao solucao){
        if (solucao == null){
            for (PassoSolucao ps : solucao) {
                System.out.println(ps.getEstado());
                System.out.println(ps.getCusto());
            }
        }
    }
}