package pee.mecproc.mem;

import pee.No;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 */
public class MemoriaPrioridade extends MemoriaProcura {

    public MemoriaPrioridade(Comparator<No> comparador) {
        super(new PriorityQueue<>(comparador));
    }
}
