package tree.bst;

import org.junit.Assert;
import org.junit.Test;

public class TestBinarySearch {


    @Test
    public void test() {
        BinarySearch bst = new BinarySearch();
        bst.insert(5);
        bst.insert(9);
        bst.insert(3);
        bst.insert(1);
        bst.insert(-14);
        bst.insert(78);

        Assert.assertTrue(bst.find(14));
    }
}
