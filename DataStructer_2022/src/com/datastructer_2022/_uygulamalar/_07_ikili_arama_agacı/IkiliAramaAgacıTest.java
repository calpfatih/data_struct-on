package com.datastructer_2022._uygulamalar._07_ikili_arama_agacı;

import com.datastructer_2022.ortak.Sabitler;
import com.datastructer_2022.yoneticiler.ICalısabilirDataStructure;

public class IkiliAramaAgacıTest implements ICalısabilirDataStructure {
    @Override
    public void calıstır() {
        IkiliAramaAgacı tree = new IkiliAramaAgacı();

        int[] values = {8, 5, 12, 3, 7, 10, 14, 1, 4, 6, 9, 11, 13, 15};
        for (int value : values) {
            tree.insert(value);
        }

        System.out.println("3 değerini içieriyor mu: " + tree.search(3));
        System.out.println("16 değerini içeriyor mu: " + tree.search(16));
    }

    @Override
    public String uygulamaIsminiAl() {
        return Sabitler.IKILI_ARAMA_AGACI;
    }
}
