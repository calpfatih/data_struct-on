package com.datastructer_2022._uygulamalar._09_sıralama_algoritmaları;

public class BubbleSort {
    // Diziyi Bubble Sort algoritmasını kullanarak sıralar.
    public static void sırala(int[] dizi) {
        // Sıralama işleminin tamamlanıp tamamlanmadığını kontrol etmek için flag.
        boolean değişti;
        // Dizinin tüm elemanlarını gez.
        do {
            // Flag'i false olarak ayarla.
            değişti = false;
            // Dizinin elemanlarını karşılaştır.
            // Eğer bir eleman daha büyükse yerlerini değiştir ve flag'i true yap.
            for (int i = 0; i < dizi.length - 1; i++) {
                if (dizi[i] > dizi[i + 1]) {
                    // Elemanları yer değiştir.
                    int temp = dizi[i];
                    dizi[i] = dizi[i + 1];
                    dizi[i + 1] = temp;
                    // Flag'i true yap.
                    değişti = true;
                }
            }
            // Eğer hiçbir eleman yer değiştirmediyse döngüyü sonlandır.
        } while (değişti);
    }
}

