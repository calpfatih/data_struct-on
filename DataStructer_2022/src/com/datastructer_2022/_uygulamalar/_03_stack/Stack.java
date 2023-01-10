package com.datastructer_2022._uygulamalar._03_stack;

import com.datastructer_2022._uygulamalar._01_tekyonlu_linkedlist.TekYonluLinkedList;

import java.util.NoSuchElementException;

public class Stack {
    private TekYonluLinkedList list;

    public Stack() {
        list = new TekYonluLinkedList();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(String element) {
        list.addFirst(element);
    }

    public String pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.removeFirst();
    }

    public String top() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.first();
    }
}
