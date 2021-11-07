package com.phongtl2008110088.tuan8;

public class Stack {
    NodeSinhVien head = null;
    NodeSinhVien tail = null;
    NodeSinhVien current = null;
    public Stack(){};
    void push(double diem, String ten){
        NodeSinhVien newNode = new NodeSinhVien(diem, ten);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    NodeSinhVien pop(){
        NodeSinhVien newNode = tail;
        current=head;
        while(current!=null){
            if(current.next==tail){
                tail=current;
                tail.next=null;
                break;
            }
            current=current.next;
        }
        return newNode;
    }
    NodeSinhVien peek(){
        NodeSinhVien newNode = tail;
        return newNode;
    }
    void print(){
        current= head;
        if(head==null){
            System.out.println("Stack rỗng");
            return;
        }
        System.out.println("Các sinh viên trong stack:");
        while(current!=null){
            current.inthongtin();
            current=current.next;
        }
    }
}
