package pee;

import java.util.*;

public interface Solucao extends Iterable<PassoSolucao> {

    Iterator<PassoSolucao> iterator();

    int getDimensão();

    double getCusto();
}
