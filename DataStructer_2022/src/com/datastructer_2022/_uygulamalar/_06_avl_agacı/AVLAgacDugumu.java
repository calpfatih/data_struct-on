package com.datastructer_2022._uygulamalar._06_avl_agacı;

public class AVLAgacDugumu {
    public int value;
    public int height;
    public AVLAgacDugumu left;
    public AVLAgacDugumu right;

    public AVLAgacDugumu(int value) {
        this.value = value;
        this.height = 1;
    }
}
