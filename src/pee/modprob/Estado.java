package pee.modprob;

/**
 *
 */
public abstract class Estado {

    public boolean equals(Object obj){
        return ( (obj instanceof Estado) && (obj.hashCode() == this.hashCode()) );
    }

    public abstract int hashCode();
}
