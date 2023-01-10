package com.datastructer_2022._uygulamalar._02_ciftyonlu_linkedlist;

import com.datastructer_2022.yoneticiler.ICalısabilirDataStructure;
import com.datastructer_2022.ortak.Sabitler;

public class CiftYonluLinkedListTest implements ICalısabilirDataStructure {

    @Override
    public void calıstır() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Liste boyutu: " + list.size());
        System.out.println("İlk eleman: " + list.first());
        System.out.println("Son eleman: " + list.last());

        list.removeFirst();
        System.out.println("İlk eleman çıkarıldıktan sonra liste boyutu: " + list.size());
        System.out.println("İlk eleman çıkarılması sonucu ilk eleman: " + list.first());

        list.removeLast();
        System.out.println("Son eleman çıkarılması sonucu liste boyutu: " + list.size());
        System.out.println("Son eleman çıkarılması sonucu son eleman: " + list.last());
    }

    @Override
    public String uygulamaIsminiAl() {
        return Sabitler.CIFT_YONLU_LINKED_LIST;
    }

}
