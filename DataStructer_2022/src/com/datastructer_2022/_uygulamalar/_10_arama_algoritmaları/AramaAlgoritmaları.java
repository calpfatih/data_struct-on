package com.datastructer_2022._uygulamalar._10_arama_algoritmaları;

public class AramaAlgoritmaları {
    public int linearSearch(int[] dizi, int aranan) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranan) {
                return i;
            }
        }
        return -1;
    }

    // Binary search algorithm
    public int binarySearch(int[] dizi, int aranan) {
        int sol = 0;
        int sağ = dizi.length - 1;
        while (sol <= sağ) {
            int orta = (sol + sağ) / 2;
            if (dizi[orta] == aranan) {
                return orta;
            } else if (dizi[orta] < aranan) {
                sol = orta + 1;
            } else {
                sağ = orta - 1;
            }
        }
        return -1;
    }

}
