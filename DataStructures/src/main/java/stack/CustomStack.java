package stack;

import linkedlist.Node;

public class CustomStack<T> {

    Node<T> top = null;


    public void push(T data) {
        Node<T> node = new Node<T>(data);
        if (null == top) {
            top = node;
        }
        else {
            node.setNext(top);
            top = node;
        }
    }

    public T pop() {
        if (null != top) {
            T data = top.getData();
            top = top.getNext();
            return data;
        }
        else {
            return null;
        }
    }

    public T peek() {
        if (null != top) {
            return top.getData();
        }
        return null;
    }
}
