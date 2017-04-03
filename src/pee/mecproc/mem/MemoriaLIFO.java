package pee.mecproc.mem;


import pee.No;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by Mónica on 03/04/2017.
 */
public class MemoriaLIFO extends MemoriaProcura {

    public MemoriaLIFO(){
        super(Collections.asLifoQueue(new LinkedList<No>()));
    }
}
