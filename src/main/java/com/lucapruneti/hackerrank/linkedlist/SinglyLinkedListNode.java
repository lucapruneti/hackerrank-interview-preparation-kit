package com.lucapruneti.hackerrank.linkedlist;

import java.util.Objects;

public class SinglyLinkedListNode {

    public Integer data;

    public SinglyLinkedListNode next;

    public SinglyLinkedListNode() {
    }

    public SinglyLinkedListNode(Integer data) {
        this.data = data;
    }

    public SinglyLinkedListNode(Integer data, SinglyLinkedListNode next) {
        this.data = data;
        this.next = next;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public SinglyLinkedListNode getNext() {
        return next;
    }

    public void setNext(SinglyLinkedListNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinglyLinkedListNode node = (SinglyLinkedListNode) o;
        return data.equals(node.data) &&
                next.equals(node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }
}
