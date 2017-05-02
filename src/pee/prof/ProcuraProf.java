package pee.prof;

import pee.mecproc.MecanismoProcura;
import pee.mecproc.mem.MemoriaLIFO;
import pee.mecproc.mem.MemoriaProcura;
import pee.modprob.Problema;

/**
 *
 */
public class ProcuraProf extends MecanismoProcura<Problema> {

    protected MemoriaProcura iniciarMemoria(){
        return new MemoriaLIFO();
    }
}
