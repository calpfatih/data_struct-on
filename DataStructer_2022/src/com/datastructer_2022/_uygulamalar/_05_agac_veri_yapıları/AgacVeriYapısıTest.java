package com.datastructer_2022._uygulamalar._05_agac_veri_yapıları;

import com.datastructer_2022.ortak.Sabitler;
import com.datastructer_2022.yoneticiler.ICalısabilirDataStructure;

public class AgacVeriYapısıTest implements ICalısabilirDataStructure {
    @Override
    public void calıstır() {
        Agac agac = new Agac();

        int[] values = {6, 4, 8, 3, 5, 7, 9};
        for (int value : values) {
            agac.insert(value);
        }

        System.out.println("4 değrini içeriyor mu: " + agac.search(4));
        System.out.println("10 değerini içeriyor mu: " + agac.search(10));

        System.out.println("Ağaç derinliği: " + agac.getDepth());

        agac.delete(8);
        System.out.println("8 değerini içeriyor mu: " + agac.search(8));

        System.out.println("Ağaç derinliği: " + agac.getDepth());

        agac.delete(3);
        System.out.println("Ağaç derinliği: " + agac.getDepth());

        agac.delete(3);
        agac.insert(10);
        agac.insert(11);
        agac.insert(12);
        System.out.println("Ağaç derinliği: " + agac.getDepth());
    }

    @Override
    public String uygulamaIsminiAl() {
        return Sabitler.AGAC_VERI_YAPISI;
    }
}
