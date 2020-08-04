package linkedlist;

interface LinkedListInterface {
    boolean isEmpty();
    void emptyList();
}

public class LinkedList implements LinkedListInterface {
    ListNode header;

    public LinkedList(ListNode node) {
        header = node;
    }

    public LinkedList() {
        this(null);
    }

    public boolean linkedListIsEmpty() {
        return header.next == null;
    }

    public boolean isEmpty() {
        return header.next == null;
    }

    public void emptyList() {
        header.next = null;
    }

    public void clearLinkedList() {
        header.next = null;
    }

    public int sizeOfLinkedList() {
        int size = 0;
        ListNode currentNode = header.next;
        while(currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }

}

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data, ListNode node) {
        this.data = data;
        next = node;
    }

    public ListNode(int data) {
        this(data, null);
    }

    public ListNode() {
        this(0, null);
    }
}
