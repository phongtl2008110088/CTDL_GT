package com.phongtl2008110088.tuan8;

public class Queue {
        NodeSinhVien head = null;
        NodeSinhVien tail = null;
        NodeSinhVien current = null;
        public Queue(){};
        void add(double diem, String ten){
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
        NodeSinhVien remove(){
            NodeSinhVien newNode = head;
            head=head.next;
            return newNode;
        }
        NodeSinhVien peek(){
            NodeSinhVien newNode = head;
            return newNode;
        }
        void print(){
            current= head;
            if(head==null){
                System.out.println("Queue rỗng");
                return;
            }
            System.out.println("Các sinh viên trong queue:");
            while(current!=null){
                current.inthongtin();
                current=current.next;
            }
        }
    }