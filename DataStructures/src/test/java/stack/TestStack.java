package stack;

import org.junit.Assert;
import org.junit.Test;
import queue.CustomQueue;

public class TestStack {

    @Test
    public void test() {
        CustomStack<String> stack = new CustomStack<String>();
        Assert.assertNull(stack.peek());

        stack.push("something");
        stack.push("else");

        Assert.assertEquals("else", stack.pop());
        Assert.assertEquals("something", stack.pop());

        stack.push("here");
        Assert.assertEquals("here", stack.peek());
    }
}
