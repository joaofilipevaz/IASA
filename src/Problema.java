/**
 * Created by Mónica on 27/03/2017.
 */
public abstract class Problema {

    public Problema(Estado estadoinicial, Operador[] operadores) {

    }

    public Estado getEstadoInicial(){

        return null;
    }

    public Operador[] getOperadores(){

        return new Operador[0];
    }

    public abstract boolean objectivo(Estado estado);

}
