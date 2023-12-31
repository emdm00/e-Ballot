package utility;

import java.io.Serializable;
import java.math.BigInteger;

/**
 *
 * @author Nakamoteam
 */
public class ElGamalSK implements Serializable { // Secret-key of El Gamal

    BigInteger s; // s is random BigInteger from 1 to q where q is the order of g (g is in the PK)
    ElGamalPK PK; // PK of El Gamal

    public ElGamalSK(BigInteger s, ElGamalPK PK) {
        this.s = s;
        this.PK = PK;
    }

    public ElGamalPK getPK() {
        return PK;
    }
}
