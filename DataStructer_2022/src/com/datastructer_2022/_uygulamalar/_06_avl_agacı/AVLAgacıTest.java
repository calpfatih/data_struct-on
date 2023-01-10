package com.datastructer_2022._uygulamalar._06_avl_agacı;

import com.datastructer_2022.ortak.Sabitler;
import com.datastructer_2022.yoneticiler.ICalısabilirDataStructure;

public class AVLAgacıTest implements ICalısabilirDataStructure {
    @Override
    public void calıstır() {
        AVLAgacı avlTree = new AVLAgacı();

        int[] values = {8, 5, 12, 3, 7, 10, 14, 1, 4, 6, 9, 11, 13, 15};
        for (int value : values) {
            avlTree.insert(value);
        }

        // Find the minimum and maximum values in the tree
        int minValue = avlTree.findMin();
        int maxValue = avlTree.findMax();
        System.out.println("Ağaçtaki en küçük değer: " + minValue);
        System.out.println("Ağaçtaki en büyük değer: " + maxValue);


        // Delete the values 7 and 8 from the tree
        avlTree.delete(7);
        avlTree.delete(8);

        // Check if the tree is balanced
        boolean isBalanced = avlTree.isBalanced();
        System.out.println("Ağaç dengeli mi: " + isBalanced);
    }

    @Override
    public String uygulamaIsminiAl() {
        return Sabitler.AVL_AGAC;
    }
}
