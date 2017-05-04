package resolvePuzzle.modProb;

import pee.modprob.Estado;
import pee.modprob.ProblemaHeur;
import puzzle.Puzzle;


public class ProblemaPuzzle extends ProblemaHeur {

    private EstadoPuzzle puzzleFinal;

    public ProblemaPuzzle(Puzzle puzzleInicial, Puzzle puzzleFinal, OperadorPuzzle[] operadorPuzzle) {
        super(new EstadoPuzzle(puzzleInicial), operadorPuzzle);
        this.puzzleFinal = new EstadoPuzzle(puzzleFinal);
    }

    @Override
    public double heuristica(Estado estado) {
        EstadoPuzzle puzzleActual = (EstadoPuzzle) estado;
        return puzzleActual.getPuzzle().distManhattan(puzzleFinal.getPuzzle());
    }

    @Override
    public boolean objectivo(Estado estado) {
        EstadoPuzzle puzzleActual = (EstadoPuzzle) estado;
        return puzzleFinal.equals(puzzleActual);
    }
}
