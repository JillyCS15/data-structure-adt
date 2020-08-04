package linkedlist;

import java.util.List;
import java.util.NoSuchElementException;

interface ListIterator {
    void insert(int data);
    void remove(int data);
    boolean find(int data);
    void setToHeader();
    void advance();
    boolean isInLinkedList();
    ListNode retrieve();
}

public class LinkedListIterator implements ListIterator {
    private LinkedList linkedList;
    private ListNode current;

    public LinkedListIterator(LinkedList linkedList) {
        this.linkedList = linkedList;
        current = linkedList.isEmpty() ? this.linkedList.header : this.linkedList.header.next;
    }

    public LinkedListIterator(List list) throws ClassCastException {
        this((LinkedList) list);
    }

    public void insert(int data) throws NoSuchElementException {
        if (current == null) throw new NoSuchElementException("Insertion Error!");

        ListNode newNode = new ListNode(data, current.next);
        current = current.next = newNode;
    }

    public void remove(int data) throws NoSuchElementException {
        ListNode currentNode = this.linkedList.header.next;

        while (currentNode.next != null && currentNode.next.data != data) {
            currentNode = currentNode.next;
        }
        if (currentNode == null)
            throw new NoSuchElementException("Remove Error!");
        else {
            currentNode.next = currentNode.next.next;
        }
    }

    public boolean find(int data) {
        ListNode currentNode = this.linkedList.header.next;

        while (currentNode != null && currentNode.data != data) {
            currentNode = currentNode.next;
        }
        if (currentNode == null)
            return false;
        else {
            current = currentNode;
            return true;
        }
    }

    public void setToHeader() {
        current = linkedList.isEmpty() ? this.linkedList.header : this.linkedList.header.next;
    }

    public void advance() {
        if (current != null) {
            current = current.next;
        }
    }

    public boolean isInLinkedList() {
        return current != null && current != linkedList.header;
    }

    public ListNode retrieve() {
        return current;
    }

    public void print() {
        for (this.setToHeader(); this.isInLinkedList(); this.advance()) {
            System.out.println(current.data);
        }
    }
}
