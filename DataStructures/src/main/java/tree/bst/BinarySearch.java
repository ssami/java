package tree.bst;

public class BinarySearch {

    BstNode root;

    public void insert(Integer data) {
        if (null == root) {
            root = new BstNode(data);
            return;
        }
        BstNode current = root;

        while (true) {
            if (current.getData() > data) {
                if (null != current.getLeft()) {
                    current = current.getLeft();
                } else {
                    current.setLeft(new BstNode(data));
                    break;
                }
            } else {
                if (null != current.getRight()) {
                    current = current.getRight();
                }
                else {
                    current.setRight(new BstNode(data));
                    break;
                }
            }
        }
        }

    public boolean find(Integer data) {
        // TODO: same as insert
        return false;
    }

    public void traverse() {
        if (null != root) {
            recurse(root);
        }


    }

    private void recurse(BstNode current) {
        if (current.getLeft() != null) {
            recurse(current.getLeft());
        }
        else {
            System.out.println(current.getData());
            return;
        }
        if (current.getRight() != null ) {
            System.out.println(current.getRight().getData());
        }

    }

}
