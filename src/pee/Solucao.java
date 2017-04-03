package pee;

import java.util.*;

public interface Solucao extends Iterable<PassoSolucao> {

    public Iterator<PassoSolucao> iterator();

    public int getDimensão();

    public double getCusto();
}
