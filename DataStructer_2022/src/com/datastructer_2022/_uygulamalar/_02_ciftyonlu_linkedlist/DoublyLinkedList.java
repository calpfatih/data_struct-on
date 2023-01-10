package com.datastructer_2022._uygulamalar._02_ciftyonlu_linkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private CiftYonluDugum head;
    private CiftYonluDugum tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int element) {
        CiftYonluDugum newNode = new CiftYonluDugum(element, null, head);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void addLast(int element) {
        CiftYonluDugum newNode = new CiftYonluDugum(element, tail, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public int first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    public int last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return tail.data;
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int element = head.data;
        head = head.next;
        size--;
        if (isEmpty()) {
            tail = null;
        } else {
            head.prev = null;
        }
        return element;
    }

    public int removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int element = tail.data;
        tail = tail.prev;
        size--;
        if (isEmpty()) {
            head = null;
        } else {
            tail.next = null;
        }
        return element;
    }
}