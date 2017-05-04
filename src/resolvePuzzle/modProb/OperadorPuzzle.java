package resolvePuzzle.modProb;

import pee.modprob.Estado;
import pee.modprob.Operador;
import puzzle.Puzzle;
import puzzle.Puzzle.Movimento;

public class OperadorPuzzle implements Operador {

    private Movimento movimento;
    private int custoMovimento;

    public OperadorPuzzle(Movimento movimento, int custoMovimento) {
        this.movimento = movimento;
        this.custoMovimento = custoMovimento;
    }

    @Override
    public Estado aplicar(Estado estado) {

        EstadoPuzzle estado_puzzle = (EstadoPuzzle) estado;

        if (estado_puzzle.getPuzzle().movimentar(movimento) != null) {
            Puzzle novoPuzzle = estado_puzzle.getPuzzle().movimentar(movimento);
            return new EstadoPuzzle(novoPuzzle);
        }
        return null;
    }

    @Override
    public float custo(Estado estado, Estado estadoSuc) {
        return custoMovimento;
    }
}
