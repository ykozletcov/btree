package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class BTree {
    private BTreeNode root;

    public BTree() {
        this.root = null;
    }

    public void setRoot(BTreeNode root) {
        this.root = root;
    }

    public BTreeNode addNode(int value, BTreeNode current) {

        if (current == null) {
            current = new BTreeNode(value);
        } else if (value < current.getValue()) {
            current.setLeft(addNode(value,current.getLeft()));
        } else if (value > current.getValue()) {
            current.setRight(addNode(value, current.getRight()));
        }
        return current;
    }

    public BTreeNode getRoot() {
        return root;
    }

    public void printTree (BTreeNode node) {
        if (node!=null) {
            printTree(node.getLeft());
            System.out.println(node.toString());
            printTree(node.getRight());
        }
    }

    public ArrayList<Integer> toArrIt (BTreeNode node) {
        ArrayList<Integer> retArr = new ArrayList<>();
        Stack<BTreeNode> treeStack = new Stack<>();
        BTreeNode cur = node;
        while (!treeStack.empty() || cur != null) {
            if (cur != null) {
                treeStack.push(cur);
                cur=cur.getLeft();
            } else {
                cur=treeStack.pop();
                retArr.add(cur.getValue());
                cur=cur.getRight();
            }

        }
        return retArr;
    }
}
