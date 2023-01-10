package com.datastructer_2022._uygulamalar._01_tekyonlu_linkedlist;

import java.util.NoSuchElementException;

public class TekYonluLinkedList {
    private Dugum head;
    private int size;

    public TekYonluLinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(String element) {
        head = new Dugum(element, head);
        size++;
    }

    public void addLast(String element) {
        Dugum newNode = new Dugum(element, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Dugum current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public String first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    public String last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Dugum current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    public String removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        String element = head.data;
        head = head.next;
        size--;
        return element;
    }
}