package com.phongtl2008110088.tuan8;

public class NodeSinhVien {
    double diem;
    String hoten;
    NodeSinhVien next;
    NodeSinhVien left;
    NodeSinhVien right;
    public NodeSinhVien(){
    }
    public NodeSinhVien(double d){
        diem = d;
        next=null;
        right = null;
        left = null;
    }
    public NodeSinhVien(double d, String t){
        diem = d;
        hoten = t;
        next=null;
        right = null;
        left = null;
    }
    public NodeSinhVien(double d, String t, NodeSinhVien n){
        diem = d;
        hoten = t;
        next= n;
    }
    void inthongtin(){
        System.out.println("Họ tên: "+hoten);
        System.out.println("Điểm: "+diem);
        System.out.println();
    }
}
