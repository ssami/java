package linkedlist;

public class LList<T> {

    private Node<T> head;

    public LList(T data) {
        head = new Node<T>(data);
    }

    public LList() {
        head = new Node<T>(null);

    }

    public void append(Node<T> n) {
        Node current = head;
        while (null != current.getNext()) {
            current = current.getNext();
        }
        current.setNext(n);
    }

    public void prepend(Node<T> n) {
        Node next = head.getNext();
        head.setNext(n);
        n.setNext(next);
    }

    public Node get(T data) {
        Node current = head;
        while (null != current &&
                current.getData() != data){
            current = current.getNext();
        }
        // we may have reached the end so check that we have the right node
        if (null != current && current.getData() == data){
            return current;
        }
        return null;
    }

    public Node delete(T data) {
        Node current = head;
        Node prev = null;
        while (current.getData() != data) {
            current = current.getNext();
            prev = current;
        }
        // we may have reached the end so check that we have the right node
        if (null != current
                && null != prev
                && current.getData() == data) {
            // do the swapsies
            prev.setNext(current.getNext());
            return current;
        }
        return null;    // we didn't even find the data
    }


    public void printAll() {
        Node current = head;
        while (null != current) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
