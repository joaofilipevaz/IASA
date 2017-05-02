package pee.larg;

import pee.Procura;
import pee.mecproc.MecanismoProcura;
import pee.mecproc.mem.MemoriaFIFO;
import pee.mecproc.mem.MemoriaProcura;
import pee.modprob.Problema;

/**
 *
 */
public class ProcuraLarg extends MecanismoProcura<Problema> {

    @Override
    protected MemoriaProcura iniciarMemoria() {
        return new MemoriaFIFO();
    }
}
