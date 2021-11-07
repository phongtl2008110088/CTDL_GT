package com.phongtl2008110088.tuan8;

public class BinaryTreetestDrive {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(5, "A");
        bt.add(8, "B");
        bt.add(6, "C");
        bt.add(9, "D");
        bt.traverseInOrder(bt.root);
    }
}
