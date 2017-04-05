package pee.modprob;

/**
 *
 */
public abstract class Estado {

    public boolean equals(Object obj){
        if (obj.equals(this)){
            return true;
        } else {
            return false;
        }
    }

    public abstract int hashCode();
}
