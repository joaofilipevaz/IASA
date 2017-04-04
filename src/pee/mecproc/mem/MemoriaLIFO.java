package pee.mecproc.mem;


import pee.No;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 */
public class MemoriaLIFO extends MemoriaProcura {

    public MemoriaLIFO(){
        super(Collections.asLifoQueue(new LinkedList<No>()));
    }
}
