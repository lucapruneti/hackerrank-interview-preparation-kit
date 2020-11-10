package com.lucapruneti.hackerrank.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListNodeTest {

    @Test
    public void testProperties() {
        SinglyLinkedListNode node = new SinglyLinkedListNode();
        Assert.assertNull(node.getData());
        Assert.assertNull(node.getNext());

        node.setData(1);
        Assert.assertEquals(Integer.valueOf(1), node.getData());

        SinglyLinkedListNode next = new SinglyLinkedListNode(2);
        node.setNext(next);
        Assert.assertNotNull(node.getNext());
        Assert.assertEquals(Integer.valueOf(2), node.getNext().getData());
    }
}
