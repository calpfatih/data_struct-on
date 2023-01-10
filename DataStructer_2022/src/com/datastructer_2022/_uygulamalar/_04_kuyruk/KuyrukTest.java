package com.datastructer_2022._uygulamalar._04_kuyruk;

import com.datastructer_2022.yoneticiler.ICalısabilirDataStructure;
import com.datastructer_2022.ortak.Sabitler;

public class KuyrukTest implements ICalısabilirDataStructure {
    @Override
    public void calıstır() {
        Kuyruk queue = new Kuyruk();
        queue.enqueue("elma");
        queue.enqueue("armut");
        queue.enqueue("kivi");

        System.out.println("Kuruk boyutu: " + queue.size());
        System.out.println("İlk eleman: " + queue.first());
        System.out.println("Son eleman: " + queue.last());

        queue.dequeue();
        System.out.println("Dequeue sonrası kuruk boyutu: " + queue.size());
        System.out.println("İlk eleman: " + queue.first());
    }

    @Override
    public String uygulamaIsminiAl() {
        return Sabitler.KUYRUK;
    }
}
