package com.lucapruneti.hackerrank.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void basicTest() {

        SinglyLinkedList llist = new SinglyLinkedList();
        SinglyLinkedListNode head = new SinglyLinkedListNode(0);
        llist.insertNode(head);

        Assert.assertEquals(head, llist.getHead());
        Assert.assertEquals(head, llist.getLast());

        SinglyLinkedListNode next = new SinglyLinkedListNode(1);
        llist.insertNode(next);

        Assert.assertEquals(head, llist.getHead());
        Assert.assertEquals(next, llist.getLast());
    }
}
