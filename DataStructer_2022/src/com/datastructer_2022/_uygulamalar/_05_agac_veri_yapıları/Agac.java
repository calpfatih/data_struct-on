package com.datastructer_2022._uygulamalar._05_agac_veri_yapıları;

public class Agac {
    private AgacDugumu root;  // Agacin kök dügümü

    // Yeni bir dügümü agaca eklemek için method
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    // Yeni bir dügümü agaca eklemek için recursive method
    private AgacDugumu insertRecursive(AgacDugumu current, int value) {
        // Base case: current dügüm null ise, yeni bir dügüm olustur
        if (current == null) {
            return new AgacDugumu(value);
        }

        // Recursive case: dügümü sol veya sag altagaca ekle
        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        } else {
            // Agacta zaten bu deger var, current dügümü geri dön
            return current;
        }

        return current;
    }

    // Agacta bir degerin aranmasi için method
    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    // Agacta bir degerin aranmasi için recursive method
    private boolean searchRecursive(AgacDugumu current, int value) {
        // Base case: current dügüm null ise, deger agacta yok
        if (current == null) {
            return false;
        }

        // Recursive case: sol veya sag altagacda arama yap
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? searchRecursive(current.left, value)
                : searchRecursive(current.right, value);
    }

    // Agactan bir degerin silinmesi için method
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    // Agactan bir degerin silinmesi için recursive method
    private AgacDugumu deleteRecursive(AgacDugumu current, int value) {
        // Base case: current dügüm null ise, deger agacta yok
        if (current == null) {
            return null;
        }

        // Recursive case: dügümü sol veya sag altagactan sil
        if (value == current.value) {
            // Silinecek dügüm bulundu
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }

            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(AgacDugumu root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public int getDepth() {
        return getDepthRecursive(root);
    }

    private int getDepthRecursive(AgacDugumu current) {
        if (current == null) {
            return 0;
        }
        int leftDepth = getDepthRecursive(current.left);
        int rightDepth = getDepthRecursive(current.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
