package pee.larg;

import pee.Procura;
import pee.mecproc.MecanismoProcura;
import pee.mecproc.mem.MemoriaLIFO;
import pee.mecproc.mem.MemoriaProcura;
import pee.modprob.Problema;

/**
 *
 */
public class ProcuraLarg extends MecanismoProcura<Problema> implements Procura {

    @Override
    protected MemoriaProcura iniciarMemoria() {
        return new MemoriaLIFO();
    }
}
