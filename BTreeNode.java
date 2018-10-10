package com.company;

public class BTreeNode {
    private int value;
    private BTreeNode left;
    private BTreeNode right;

    public BTreeNode (int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(BTreeNode left) {
        this.left = left;
    }

    public void setRight(BTreeNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public BTreeNode getLeft() {
        return left;
    }

    public BTreeNode getRight() {
        return right;
    }

    @Override
    public String toString() {
        return ""+value;
    }
}
