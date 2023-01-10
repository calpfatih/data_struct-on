package com.datastructer_2022._uygulamalar._09_sıralama_algoritmaları;

import com.datastructer_2022.ortak.Sabitler;
import com.datastructer_2022.yoneticiler.ICalısabilirDataStructure;

import java.util.Arrays;

public class SıralamaAlgoritmalarıTest implements ICalısabilirDataStructure {
    @Override
    public void calıstır() {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        // Quick Sort
        QuickSort.sırala(array);
        System.out.println("Quick Sort: " + Arrays.toString(array));

        // Bubble Sort
        array = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        BubbleSort.sırala(array);
        System.out.println("Bubble Sort: " + Arrays.toString(array));

        // Insertion Sort
        array = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        InsertionSort.sırala(array);
        System.out.println("Insertion Sort: " + Arrays.toString(array));

        // Merge Sort
        array = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        MergeSort.sırala(array);
        System.out.println("Merge Sort: " + Arrays.toString(array));
    }

    @Override
    public String uygulamaIsminiAl() {
        return Sabitler.SIRALAMA_ALGORTIMALARI;
    }
}
