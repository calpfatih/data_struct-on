package com.datastructer_2022._uygulamalar._08_agacta_dolasım;

import com.datastructer_2022._uygulamalar._07_ikili_arama_agacı.IkiliAramaAgacı;
import com.datastructer_2022._uygulamalar._07_ikili_arama_agacı.NodeVisitor;
import com.datastructer_2022.ortak.Sabitler;
import com.datastructer_2022.yoneticiler.ICalısabilirDataStructure;

public class AgactaDolasımTest implements ICalısabilirDataStructure {
    @Override
    public void calıstır() {
        IkiliAramaAgacı tree = new IkiliAramaAgacı();

        // Insert some values into the tree
        int[] values = {8, 5, 12, 3, 7, 10, 14, 1, 4, 6, 9, 11, 13, 15};
        for (int value : values) {
            tree.insert(value);
        }

        // Preorder dolaşım
        System.out.print("Preorder dolaşım: ");
        tree.traversePreOrder(new NodeVisitor() {
            @Override
            public void visit(int value) {
                System.out.print(value + " ");
            }
        });
        System.out.println();

        // Inorder dolaşım
        System.out.print("Inorder dolaşım: ");
        tree.traverseInOrder(new NodeVisitor() {
            @Override
            public void visit(int value) {
                System.out.print(value + " ");
            }
        });
        System.out.println();

        // Postorder dolaşım
        System.out.print("Postorder dolaşım: ");
        tree.traversePostOrder(new NodeVisitor() {
            @Override
            public void visit(int value) {
                System.out.print(value + " ");
            }
        });
        System.out.println();
    }

    @Override
    public String uygulamaIsminiAl() {
        return Sabitler.AGAC_DOLASIM;
    }
}
