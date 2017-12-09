package secure.hash;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hasher {

    private HashAlgorithm algorithm;

    public Hasher(HashAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public String encode(String input) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm.getValue());
        messageDigest.update(input.getBytes());
        return new BigInteger(messageDigest.digest()).toString(16);
    }
}
