package com.datastructer_2022._uygulamalar._09_sıralama_algoritmaları;

public class InsertionSort {
    // Diziyi Insertion Sort algoritmasını kullanarak sıralar.
    public static void sırala(int[] dizi) {
        // Dizinin tüm elemanlarını gez.
        for (int i = 1; i < dizi.length; i++) {
            // Geçerli elemanı tut.
            int geçerli = dizi[i];
            // Geçerli elemanın yerini bul.
            int j = i - 1;
            // Geçerli elemanın yerini bulana kadar dizinin sol tarafını gez.
            // Eğer geçerli eleman sol tarafındaki bir elemandan küçükse yerlerini değiştir.
            while (j >= 0 && dizi[j] > geçerli) {
                dizi[j + 1] = dizi[j];
                j = j - 1;
            }
            // Geçerli elemanın yerini bul.
            dizi[j + 1] = geçerli;
        }
    }
}

