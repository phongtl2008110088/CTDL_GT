package com.phongtl2008110088.tuan8;

public class BinaryTree {
    NodeSinhVien root;
    private NodeSinhVien addRecursive(NodeSinhVien current, double diem, String ten) {
        if (current == null) {
            return new NodeSinhVien(diem, ten);
        }
    
        if (diem < current.diem) {
            current.left = addRecursive(current.left, diem, ten);
        } else if (diem > current.diem) {
            current.right = addRecursive(current.right, diem, ten);
        } else {
            // diem already exists
            return current;
        }
    
        return current;
    }
    public void add(double diem, String ten) {
        root = addRecursive(root, diem, ten);
    }
    private boolean containsNodeRecursive(NodeSinhVien current, double diem) {
        if (current == null) {
            return false;
        } 
        if (diem == current.diem) {
            return true;
        } 
        return diem < current.diem
          ? containsNodeRecursive(current.left, diem)
          : containsNodeRecursive(current.right, diem);
    }
    public boolean containsNode(double diem) {
        return containsNodeRecursive(root, diem);
    }
    public void traverseInOrder(NodeSinhVien node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.inthongtin();
            traverseInOrder(node.right);
        }
    }
    public void traversePreOrder(NodeSinhVien node) {
        if (node != null) {
            node.inthongtin();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traversePostOrder(NodeSinhVien node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.inthongtin();
        }
    }
    private NodeSinhVien deleteRecursive(NodeSinhVien current, double diem) {
        if (current == null) {
            return null;
        }
    
        if (diem == current.diem) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            
            if (current.left == null) {
                return current.right;
            }
            double smallestValue = findSmallestValue(current.right);
            current.diem = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        } 
        if (diem < current.diem) {
            current.left = deleteRecursive(current.left, diem);
            return current;
        }
        current.right = deleteRecursive(current.right, diem);
        return current;
    }
    private double findSmallestValue(NodeSinhVien root) {
        return root.left == null ? root.diem : findSmallestValue(root.left);
    }
    public void delete(double diem) {
        root = deleteRecursive(root, diem);
    }
}
