package com.datastructer_2022._uygulamalar._01_tekyonlu_linkedlist;

import com.datastructer_2022.yoneticiler.ICalısabilirDataStructure;
import com.datastructer_2022.ortak.Sabitler;

public class TekYonluLinkedListTest implements ICalısabilirDataStructure {

    @Override
    public void calıstır() {
        TekYonluLinkedList list = new TekYonluLinkedList();
        //İlk eleman oalrak ekle
        list.addFirst("elma");
        //İlk eleman olarak ekle. Armut şimdi ilk eleman
        list.addFirst("armut");

        //Son eleman olarak ekle
        list.addLast("muz");
        list.addLast("kivi");

        System.out.println("Liste boyutu: " + list.size());
        System.out.println("İlk eleman: " + list.first());
        System.out.println("Son eleman: " + list.last());

        list.removeFirst();
        System.out.println("İlk elamanının çıkarılması sonucu liste boyutu: " + list.size());
        System.out.println("İlk elemanın çıkarılması sonucu ilk eleman: " + list.first());
    }

    @Override
    public String uygulamaIsminiAl() {
        return Sabitler.TEK_YONLU_LINKED_LIST;
    }
}
