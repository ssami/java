package hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class MD5HashFunction implements IHashFunction {

    MessageDigest instance = MessageDigest.getInstance("MD5");

    public MD5HashFunction() throws NoSuchAlgorithmException { }

    public int hashCode(String key) {
        byte[] md5 = instance.digest(key.getBytes());
        int index = Arrays.hashCode(md5);
        if (index < 0) {
            index *= -1;
        }
        return generateSmallIndex(index);
    }

    private int generateSmallIndex(int index) {
        int maxDiv = 3;     // divide until 1000
        int startDivisor = 10;
        int divCount = 0;
        int count = 0;
        while (divCount < maxDiv) {
            int digit = index % startDivisor;
            index /= startDivisor;
            divCount++;
            count += digit;
        }
        return count % 10;
    }
}
