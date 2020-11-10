package com.lucapruneti.hackerrank.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class InsertNodeAtPositionTest {

    @Test
    public void insertNodeAtPosition00Test() {

        SinglyLinkedList llist = new SinglyLinkedList();
        llist.insertNode(new SinglyLinkedListNode(16));
        llist.insertNode(new SinglyLinkedListNode(13));
        llist.insertNode(new SinglyLinkedListNode(17));

        int data = 1;
        int position = 2;

        SinglyLinkedListNode head = InsertNodeAtPosition.insertNodeAtPosition(llist.getHead(), data, position);
        Assert.assertEquals(llist.getHead(), head);

        Assert.assertEquals("16 13 1 17", llist.toString());
    }

    @Test
    public void insertNodeAtPosition01Test() {

        SinglyLinkedList llist = new SinglyLinkedList();
        llist.insertNode(new SinglyLinkedListNode(11));
        llist.insertNode(new SinglyLinkedListNode(9));
        llist.insertNode(new SinglyLinkedListNode(19));
        llist.insertNode(new SinglyLinkedListNode(10));
        llist.insertNode(new SinglyLinkedListNode(4));

        int data = 20;
        int position = 3;

        SinglyLinkedListNode head = InsertNodeAtPosition.insertNodeAtPosition(llist.getHead(), data, position);
        Assert.assertEquals(llist.getHead(), head);

        Assert.assertEquals("11 9 19 20 10 4", llist.toString());
    }

    @Test
    public void insertNodeAtPosition09Test() {

        SinglyLinkedList llist = new SinglyLinkedList();
        llist.insertNode(new SinglyLinkedListNode(1));
        llist.insertNode(new SinglyLinkedListNode(2));
        llist.insertNode(new SinglyLinkedListNode(3));
        llist.insertNode(new SinglyLinkedListNode(4));
        llist.insertNode(new SinglyLinkedListNode(5));
        llist.insertNode(new SinglyLinkedListNode(6));

        int data = 7;
        int position = 5;

        SinglyLinkedListNode head = InsertNodeAtPosition.insertNodeAtPosition(llist.getHead(), data, position);
        Assert.assertEquals(llist.getHead(), head);

        Assert.assertEquals("1 2 3 4 5 7 6", llist.toString());
    }

}
