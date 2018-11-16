package linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class TestLinkedList {

    @Test
    public void testInsertAndGet() {
        LList<Integer> link = new LList<Integer>();
        link.append(new Node<Integer>(5));
        Node n = link.get(5);
        Assert.assertEquals(5, n.getData());
    }

    @Test
    public void testInsertAndNotFind() {
        LList<Integer> link = new LList<Integer>();
        link.append(new Node<Integer>(5));
        Node n = link.get(17);
        Assert.assertNull(n);
    }

}
