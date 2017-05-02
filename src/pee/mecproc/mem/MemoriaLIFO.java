package pee.mecproc.mem;

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
