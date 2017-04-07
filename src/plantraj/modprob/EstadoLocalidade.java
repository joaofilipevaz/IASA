package plantraj.modprob;

import pee.modprob.Estado;

public class EstadoLocalidade extends Estado {

    private String localidade;

    public EstadoLocalidade(String localidade){
        this.localidade = localidade;
    }

    @Override
    public int hashCode() {
        return localidade.hashCode();
    }

    public String toString(){
        return localidade;
    }
}
