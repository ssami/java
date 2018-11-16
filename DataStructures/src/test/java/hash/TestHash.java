package hash;

import org.junit.Assert;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

public class TestHash {

    @Test
    public void testHash() throws NoSuchAlgorithmException {
        MD5HashFunction func = new MD5HashFunction();
        int index = func.hashCode("person");
        Assert.assertEquals(4, index);
    }

    @Test
    public void testTable() throws NoSuchAlgorithmException {
        CustomHashTable<Person> ht = new CustomHashTable<Person>(
                new MD5HashFunction());
        ht.put("hello", new Person("John", "Smith"));
        Person p = ht.get("hello");
        Assert.assertEquals("John", p.getFirst());
        Assert.assertEquals("Smith", p.getLast());
    }
}
