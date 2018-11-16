package queue;

import linkedlist.LList;
import linkedlist.Node;

public class CustomQueue<T> {

    Node<T> head = null; // remove from head
    Node<T> tail = null; // insert at tail

    public void insert(T data) {
        Node<T> n = new Node<T>(data);
        if (null != tail) {
            tail.setNext(n);
            tail = n;
        }
        else {
            tail = n;
        }
        if (null == head) {
            head = n;
        }
    }

    public T peek(){
        return head.getData();
    }

    public T remove() {
        Node<T> toRem = head;
        if (null != head) {
            head = head.getNext();

            return toRem.getData();
        }
        else {
            head = tail;
        }
        return null;
    }

}
