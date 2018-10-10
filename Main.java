package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] Arr = {7,2,-1,5,12};
        ArrayList<Integer> arr2 = new ArrayList<>();
        BTree bt = new BTree();

        bt.setRoot(new BTreeNode(Arr[0]));
        for (int i=0; i<Arr.length; i++) {
            bt.addNode(Arr[i],bt.getRoot());
        }

        bt.printTree(bt.getRoot());

        arr2 = bt.toArrIt(bt.getRoot());
        for ( int c: arr2
             ) {
            System.out.println(c);
        }
    }
}
