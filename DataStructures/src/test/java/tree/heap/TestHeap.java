package tree.heap;

import org.junit.Assert;
import org.junit.Test;

public class TestHeap {

    @Test
    public void test(){
        MinHeap heap = new MinHeap();
        heap.insert(134);
        heap.insert(55);
        heap.insert(53);
        heap.insert(12);
        heap.insert(8);

        int[] expected = new int[]{8, 12, 55, 134, 53};
        int[] actual = heap.debug();
        Assert.assertArrayEquals(expected, actual);
    }

}
