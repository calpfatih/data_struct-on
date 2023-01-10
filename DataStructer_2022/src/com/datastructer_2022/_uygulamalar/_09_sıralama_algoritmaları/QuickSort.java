package com.datastructer_2022._uygulamalar._09_sıralama_algoritmaları;

public class QuickSort {
    // Diziyi Quick Sort algoritmasını kullanarak sıralar.
    public static void sırala(int[] dizi) {
        sırala(dizi, 0, dizi.length - 1);
    }

    // Diziyi Quick Sort algoritmasını kullanarak sıralar.
    // Recursive olarak çağırılır.
    private static void sırala(int[] dizi, int sol, int sağ) {
        // Pivot noktasını (orta nokta) hesapla.
        int pivot = dizi[sol + (sağ - sol) / 2];
        // Sol ve sağ indekslerini ayarla.
        int i = sol;
        int j = sağ;

        // Dizinin sol tarafındaki elemanları pivot ile karşılaştır.
        // Eğer pivot'tan küçükse pivot'un sağ tarafına taşı.
        while (i <= j) {
            while (dizi[i] < pivot) {
                i++;
            }
            while (dizi[j] > pivot) {
                j--;
            }
            if (i <= j) {
                // Elemanları yer değiştir.
                int temp = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = temp;
                // İndeksleri artır/azalt.
                i++;
                j--;
            }
        }

        // Sol tarafı sırala.
        if (sol < j) {
            sırala(dizi, sol, j);
        }
        // Sağ tarafı sırala.
        if (i < sağ) {
            sırala(dizi, i, sağ);
        }
    }
}
