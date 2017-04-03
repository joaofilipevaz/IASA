package pee.modprob;

public abstract class Problema {

    private Estado estadoinicial;
    private Operador[] operadores;

    public Problema(Estado estadoinicial, Operador[] operadores) {
        this.estadoinicial = estadoinicial;
        this.operadores = operadores;
    }

    public Estado getEstadoInicial(){
        return this.estadoinicial;
    }

    public Operador[] getOperadores(){
        return new Operador[0];
    }

    public abstract boolean objectivo(Estado estado);

}
