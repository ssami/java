package tree.trie;

import org.junit.Assert;
import org.junit.Test;

public class TestTrie {

    @Test
    public void test() {
        Trie t = new Trie();
        t.add("many");
        t.add("manicure");
        Assert.assertTrue(t.isPrefix("man"));
        Assert.assertFalse(t.isPrefix("max"));
        Assert.assertFalse(t.isPrefix("mop"));
    }
}
