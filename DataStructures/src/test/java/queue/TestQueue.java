package queue;

import linkedlist.Node;
import org.junit.Assert;
import org.junit.Test;

public class TestQueue {

    @Test
    public void test() {
        CustomQueue<Integer> q = new CustomQueue<Integer>();
        q.insert(5);
        q.insert(6);
        q.insert(7);

        Assert.assertEquals(new Integer(5), q.peek());
        Assert.assertEquals(new Integer(5), q.peek());
        Assert.assertEquals(new Integer(5), q.remove());

        Assert.assertEquals(new Integer(6), q.peek());
        Assert.assertEquals(new Integer(6), q.remove());

        Assert.assertEquals(new Integer(7), q.peek());
        Assert.assertEquals(new Integer(7), q.remove());
    }


}
