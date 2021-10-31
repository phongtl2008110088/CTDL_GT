package com.phongtl2008110088.tuan7;

public class NodeSP {
    
    double gia;
    String ten;
    NodeSP next;
    NodeSP previous;
    public NodeSP(){

    }
    public NodeSP(double g, String t){
        gia=g;
        ten=t;
        next=null;
        previous=null;
    }
    public NodeSP(double g, String t, NodeSP n, NodeSP p){
        gia=g;
        ten=t;
        next=n;
        previous=p;
    }
    public void inthongtin(){
        System.out.println("Tên: "+ten);;
        System.out.println("Giá: "+gia);
    }
}
