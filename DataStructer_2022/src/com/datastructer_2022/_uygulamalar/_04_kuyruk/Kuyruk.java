package com.datastructer_2022._uygulamalar._04_kuyruk;

import com.datastructer_2022._uygulamalar._01_tekyonlu_linkedlist.TekYonluLinkedList;

import java.util.NoSuchElementException;

public class Kuyruk {
    private TekYonluLinkedList list;

    public Kuyruk() {
        list = new TekYonluLinkedList();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(String element) {
        list.addLast(element);
    }

    public String dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.removeFirst();
    }

    public String first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.first();
    }

    public String last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.last();
    }
}

