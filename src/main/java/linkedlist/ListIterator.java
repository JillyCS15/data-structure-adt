package linkedlist;

public interface ListIterator {
    void insert(ListNode node);
    void remove(ListNode node);
    void setToHeader();
    void advance();
    boolean isInLinkedList(int data);
    ListNode retrieve();
}
