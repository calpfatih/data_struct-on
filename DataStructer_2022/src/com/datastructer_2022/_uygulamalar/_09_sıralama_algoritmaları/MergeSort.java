package com.datastructer_2022._uygulamalar._09_sıralama_algoritmaları;

public class MergeSort {
    // Diziyi Merge Sort algoritmasını kullanarak sıralar.
    public static void sırala(int[] dizi) {
        // Yardımcı dizi oluştur.
        int[] yardımcı = new int[dizi.length];
        // Sıralama işlemini gerçekleştir.
        sırala(dizi, yardımcı, 0, dizi.length - 1);
    }

    // Diziyi Merge Sort algoritmasını kullanarak sıralar.
    // Recursive olarak çağırılır.
    private static void sırala(int[] dizi, int[] yardımcı, int sol, int sağ) {
        // Eğer sol indeks sağ indeksten küçükse (yani dizi 1 elemandan fazla)
        if (sol < sağ) {
            // Orta noktayı hesapla.
            int orta = (sol + sağ) / 2;
            // Sol tarafı sırala.
            sırala(dizi, yardımcı, sol, orta);
            // Sağ tarafı sırala.
            sırala(dizi, yardımcı, orta + 1, sağ);
            // Sıralanmış sol ve sağ tarafları birleştir.
            birleştir(dizi, yardımcı, sol, orta, sağ);
        }
    }

    // Sıralanmış sol ve sağ tarafları birleştirir.
    private static void birleştir(int[] dizi, int[] yardımcı, int sol, int orta, int sağ) {
        // Yardımcı diziye dizinin tüm elemanlarını kopyala.
        for (int i = sol; i <= sağ; i++) {
            yardımcı[i] = dizi[i];
        }

        // Yardımcı dizinin sol ve sağ indekslerini ayarla.
        int yardımcıSol = sol;
        int yardımcıSağ = orta + 1;
        // Geçerli indeksi ayarla.
        int geçerli = sol;

        // Yardımcı dizinin sol ve sağ taraflarındaki elemanları karşılaştırıp
        // diziye ekle.
        while (yardımcıSol <= orta && yardımcıSağ <= sağ) {
            if (yardımcı[yardımcıSol] <= yardımcı[yardımcıSağ]) {
                dizi[geçerli] = yardımcı[yardımcıSol];
                yardımcıSol++;
            } else {
                dizi[geçerli] = yardımcı[yardımcıSağ];
                yardımcıSağ++;
            }
            geçerli++;
        }

        int remaining = orta - yardımcıSol;
        for (int i = 0; i <= remaining; i++) {
            dizi[geçerli + i] = yardımcı[yardımcıSol + i];
        }
    }
}
