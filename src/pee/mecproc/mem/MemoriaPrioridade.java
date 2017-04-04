package pee.mecproc.mem;

import pee.No;

import java.util.Comparator;
import java.util.Queue;

/**
 *
 */
public class MemoriaPrioridade extends MemoriaProcura implements Comparator<No> {

    public MemoriaPrioridade(Comparator<No> comparador) {
        super(comparador);
    }

    @Override
    public int compare(No o1, No o2) {
        return 0;
    }
}
