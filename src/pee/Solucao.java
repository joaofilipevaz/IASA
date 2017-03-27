package pee;

import java.util.Iterator;

/**
 * Created by Mónica on 27/03/2017.
 */
public interface Solucao {

    public Iterator<PassoSolucao> interator();

    public int getDimensão();

    public double getCusto();
}
