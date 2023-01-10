package com.datastructer_2022._uygulamalar._06_avl_agacı;

public class AVLAgacı {
    private AVLAgacDugumu root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }


    private AVLAgacDugumu insertRecursive(AVLAgacDugumu current, int value) {
        if (current == null) {
            return new AVLAgacDugumu(value);
        }

        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        } else {
            return current;
        }


        current.height = Math.max(getHeight(current.left), getHeight(current.right)) + 1;


        int balance = getBalance(current);
        if (balance > 1 && value < current.left.value) {
            return rotateRight(current);
        }
        if (balance < -1 && value > current.right.value) {
            return rotateLeft(current);
        }
        if (balance > 1 && value > current.left.value) {
            current.left = rotateLeft(current.left);
            return rotateRight(current);
        }
        if (balance < -1 && value < current.right.value) {
            current.right = rotateRight(current.right);
            return rotateLeft(current);
        }

        return current;
    }

    public boolean search(int value) {
        return searchRecursive(root, value);
    }


    private boolean searchRecursive(AVLAgacDugumu current, int value) {
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

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private AVLAgacDugumu deleteRecursive(AVLAgacDugumu current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
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

    private int findSmallestValue(AVLAgacDugumu root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    protected int getHeight(AVLAgacDugumu node) {
        return node == null ? 0 : node.height;
    }

    private int getBalance(AVLAgacDugumu node) {
        return node == null ? 0 : getHeight(node.left) - getHeight(node.right);
    }

    private AVLAgacDugumu rotateLeft(AVLAgacDugumu node) {
        AVLAgacDugumu right = node.right;
        AVLAgacDugumu rightLeft = right.left;

        right.left = node;
        node.right = rightLeft;

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        right.height = Math.max(getHeight(right.left), getHeight(right.right)) + 1;

        return right;
    }

    private AVLAgacDugumu rotateRight(AVLAgacDugumu node) {
        AVLAgacDugumu left = node.left;
        AVLAgacDugumu leftRight = left.right;

        left.right = node;
        node.left = leftRight;

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        left.height = Math.max(getHeight(left.left), getHeight(left.right)) + 1;

        return left;
    }

    public int findMin() {
        return root == null ? 0 : findMinRecursive(root);
    }

    private int findMinRecursive(AVLAgacDugumu current) {
        return current.left == null ? current.value : findMinRecursive(current.left);
    }

    public int findMax() {
        return root == null ? 0 : findMaxRecursive(root);
    }

    private int findMaxRecursive(AVLAgacDugumu current) {
        return current.right == null ? current.value : findMaxRecursive(current.right);
    }

    public boolean isBalanced() {
        return isBalancedRecursive(root);
    }

    private boolean isBalancedRecursive(AVLAgacDugumu current) {
        if (current == null) {
            return true;
        }
        int balance = getBalance(current);
        if (balance > 1 || balance < -1) {
            return false;
        }
        return isBalancedRecursive(current.left) && isBalancedRecursive(current.right);
    }
}
