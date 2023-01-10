package com.datastructer_2022._uygulamalar._07_ikili_arama_agacı;

public class IkiliAramaAgacı {
    private IkiliAramaAgacıDugumu root;

    public IkiliAramaAgacı() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private IkiliAramaAgacıDugumu insertRecursive(IkiliAramaAgacıDugumu current, int value) {
        if (current == null) {
            return new IkiliAramaAgacıDugumu(value);
        }
        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        }
        return current;
    }

    public void traversePreOrder(NodeVisitor visitor) {
        traversePreOrderRecursive(root, visitor);
    }

    private void traversePreOrderRecursive(IkiliAramaAgacıDugumu current, NodeVisitor visitor) {
        if (current == null) {
            return;
        }
        visitor.visit(current.value);
        traversePreOrderRecursive(current.left, visitor);
        traversePreOrderRecursive(current.right, visitor);
    }

    public void traverseInOrder(NodeVisitor visitor) {
        traverseInOrderRecursive(root, visitor);
    }

    private void traverseInOrderRecursive(IkiliAramaAgacıDugumu current, NodeVisitor visitor) {
        if (current == null) {
            return;
        }
        traverseInOrderRecursive(current.left, visitor);
        visitor.visit(current.value);
        traverseInOrderRecursive(current.right, visitor);
    }

    public void traversePostOrder(NodeVisitor visitor) {
        traversePostOrderRecursive(root, visitor);
    }

    private void traversePostOrderRecursive(IkiliAramaAgacıDugumu current, NodeVisitor visitor) {
        if (current == null) {
            return;
        }
        traversePostOrderRecursive(current.left, visitor);
        traversePostOrderRecursive(current.right, visitor);
        visitor.visit(current.value);
    }

    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(IkiliAramaAgacıDugumu current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? searchRecursive(current.left, value)
                : searchRecursive(current.right, value);
    }
}
