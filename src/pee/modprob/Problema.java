package pee.modprob;

import java.util.ArrayList;

public abstract class Problema {

    private Estado estadoinicial;
    private ArrayList<Operador> operadores;

    public Problema(Estado estadoinicial, ArrayList<Operador> operadores) {
        this.estadoinicial = estadoinicial;
        this.operadores = new ArrayList<>();
    }

    public Estado getEstadoInicial(){
        return this.estadoinicial;
    }

    public ArrayList<Operador> getOperadores(){
        return this.operadores;
    }

    public abstract boolean objectivo(Estado estado);
}
