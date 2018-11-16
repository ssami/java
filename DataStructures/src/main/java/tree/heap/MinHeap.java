package tree.heap;

public class MinHeap {

    private final int CAPACITY = 100;
    private int[] heap = new int[CAPACITY];
    private int size = 0;

    public int getLeftChild(int parentIndex) {
        return heap[getLeftChildIndex(parentIndex)];
    }

    public int getRightChild(int parentIndex) {
        return heap[parentIndex*2 + 2];
    }

    private int getParent(int childIndex){
        return heap[getParentIndex(childIndex)];
    }

    private int getParentIndex(int childIndex) {
        return (childIndex-1)/2;
    }

    private int getLeftChildIndex(int currentIndex) {
        return currentIndex*2 + 1;
    }

    public void insert(Integer data) {
        heap[size] = data; //insert at bottom of heap
        int currIndex = size;
        while (getParent(currIndex) > data) {   // swap until parent is less than current
            swap(getParentIndex(currIndex), currIndex);
            currIndex = getParentIndex(currIndex);
        }
        size++;
    }

    private void swap(int indexOne, int indexTwo) {
        int temp = heap[indexOne];
        heap[indexOne] = heap[indexTwo];
        heap[indexTwo] = temp;
    }

    // returns min element
    public int peek() {
        return heap[0];
    }

    public int[] debug() {
        return heap;
    }

    // removes min element
    public int poll(){
        int minEl = heap[0];
        heap[0] = heap[size-1];
        int currentIndex = 0;
        while (heap[currentIndex] > getLeftChild(currentIndex)
                || heap[currentIndex] > getRightChild(currentIndex)) {
            if (getLeftChild(currentIndex) < getRightChild(currentIndex)){
                swap(getLeftChildIndex(currentIndex), currentIndex);
            }
        }
        size--;

        return minEl;
    }


}
