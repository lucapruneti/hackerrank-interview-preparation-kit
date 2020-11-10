package com.lucapruneti.hackerrank.linkedlist;

public class InsertNodeAtPosition {

    /**
     * Given the pointer to the head node of a linked list and an integer to insert at a certain position,
     * create a new node with the given integer as its  attribute,
     * insert this node at the desired position and return the head node.
     *
     * @param head,     a SinglyLinkedListNode pointer to the head of the list
     * @param data,     an integer value to insert as data in your new node
     * @param position, an integer position to insert the new node, zero based indexing
     * @return a reference to the head of the revised list
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

        SinglyLinkedListNode current = head;

        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.getNext();
        }

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data, current.getNext());
        current.setNext(newNode);

        return head;
    }

}
