package com.datastructer_2022._uygulamalar._02_ciftyonlu_linkedlist;

public class CiftYonluDugum {
    protected int data;
    protected CiftYonluDugum prev;
    protected CiftYonluDugum next;

    public CiftYonluDugum(int data, CiftYonluDugum prev, CiftYonluDugum next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
