package com.lucapruneti.hackerrank.linkedlist;

public class SinglyLinkedList {

    private SinglyLinkedListNode head;

    private SinglyLinkedListNode last;

    public SinglyLinkedListNode getHead() {
        return head;
    }

    public SinglyLinkedListNode getLast() {
        return last;
    }

    public void insertNode(SinglyLinkedListNode node) {
        if (head == null) {
            this.head = node;
            this.last = this.head;
        } else {
            this.last.setNext(node);
            this.last = node;
        }
    }

}
